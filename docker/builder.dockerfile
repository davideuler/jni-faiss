FROM centos-7-mkl:202201
## base image for speed up maven build:
## docker build -t centos-7-vectordb-lib-builder:202201 -f builder.dockerfile .

ENV LANG en_US.UTF-8
ENV LC_ALL en_US.UTF-8
ENV LIBRARY_PATH /opt/intel/mkl/lib/intel64
ENV LD_LIBRARY_PATH $(LD_LIBRARY_PATH):/opt/intel/mkl/lib/intel64
ENV LD_PRELOAD /opt/intel/mkl/lib/intel64/libmkl_def.so:/opt/intel/mkl/lib/intel64/libmkl_avx2.so:/opt/intel/mkl/lib/intel64/libmkl_core.so:/opt/intel/mkl/lib/intel64/libmkl_intel_lp64.so:/opt/intel/mkl/lib/intel64/libmkl_intel_thread.so:/opt/intel/mkl/lib/intel64/libmkl_intel_thread.so:/opt/intel/compilers_and_libraries_2020.4.304/linux/compiler/lib/intel64_lin/libiomp5.so
ENV TZ=Asia/Shanghai

RUN yum install -y lapack lapack-devel && \
    yum install -y gcc-c++ make swig3 && \
    yum install -y java-1.8.0-openjdk java-1.8.0-openjdk-devel maven

## build faiss
COPY . /opt/jni-faiss
WORKDIR /opt/jni-faiss/faiss
## build faiss 1.6.1 with intel mkl support:
RUN LDFLAGS=-L/opt/intel/mkl/lib/intel64 ./configure --prefix=/usr --libdir=/usr/lib64 --without-cuda
RUN ./configure --prefix=/usr --libdir=/usr/lib64 --without-cuda
RUN make -j $(nproc)
RUN make install


WORKDIR /opt/jni-faiss/jni
RUN make

## for downloading maven dependencies, to speed up final Dockerfile build.
WORKDIR /opt/jni-faiss
RUN mvn clean package -DskipTests=true -pl vectorlib-cpu -am && rm -rf /opt/jni-faiss/
