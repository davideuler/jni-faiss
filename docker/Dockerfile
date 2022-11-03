## build jni-faiss， build a container for jni-faiss (with jar and intel mtk, lapack included)
##    docker build -t jni-faiss .
## test the image:
##    docker run --rm -it jni-faiss java -cp /cpu-demo-0.0.1-SNAPSHOT.jar com.damo.vectordb.faiss.tutorial.TwoIVFFlat

## import builder which has java/maven dependency and intel mkl installed:
FROM centos-7-vectordb-lib-builder:202201 as builder

##  if error shows No rule to make target `/usr/local/include/omp.h', need to clean previous build on mac
## (cd faiss && make clean && rm depend)
## (cd jni && make clean)

ENV LANG en_US.UTF-8
ENV LC_ALL en_US.UTF-8

COPY . /opt/jni-faiss
WORKDIR /opt/jni-faiss
RUN mvn clean package -DskipTests=true -pl cpu-demo -am

# Stage to build package
FROM centos:7

ENV LANG en_US.UTF-8
ENV LC_ALL en_US.UTF-8
ENV TZ=Asia/Shanghai

ENV LD_LIBRARY_PATH $(LD_LIBRARY_PATH):/opt/intel/mkl/lib/intel64
ENV LD_PRELOAD /opt/intel/mkl/lib/intel64/libmkl_def.so:/opt/intel/mkl/lib/intel64/libmkl_avx2.so:/opt/intel/mkl/lib/intel64/libmkl_core.so:/opt/intel/mkl/lib/intel64/libmkl_intel_lp64.so:/opt/intel/mkl/lib/intel64/libmkl_intel_thread.so:/opt/intel/mkl/lib/intel64/libmkl_intel_thread.so:/opt/intel/compilers_and_libraries_2020.4.304/linux/compiler/lib/intel64_lin/libiomp5.so

RUN yum install -y lapack lapack-devel java-11-openjdk

# copy build result from compilation stage to current image
COPY --from=builder /opt/intel/ /opt/intel/
COPY --from=builder /opt/jni-faiss/cpu-demo/target/cpu-demo-0.0.1-SNAPSHOT.jar  /cpu-demo-0.0.1-SNAPSHOT.jar
