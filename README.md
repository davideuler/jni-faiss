# jni-faiss
> works for Linux and Mac(both intel and m1 version)

## cpu

- git clone https://github.com/gameofdimension/jni-faiss.git && cd jni-faiss && git submodule update --init

- docker build -t jni-faiss .

- docker run -it jni-faiss java -cp cpu-demo/target/cpu-demo-0.0.1.jar com.gameofdimension.faiss.tutorial.OneFlat

## gpu

- git clone https://github.com/gameofdimension/jni-faiss.git && cd jni-faiss && git submodule update --init

- docker build -t jni-faiss-gpu -f DockerfileGpu .

- docker run --gpus 1 -it jni-faiss-gpu java -Xmx8g -cp gpu-demo/target/gpu-demo-0.0.1.jar com.gameofdimension.faiss.tutorial.GpuOneFlat

## build faiss
git submodule update --init
cd faiss
./configure --prefix=/usr --libdir=/usr/lib64 --without-cuda

#####for mac m1, update Clustering.cpp: finite -> isfinite
./configure --prefix=/usr/local --libdir=/usr/local/lib --without-cuda
make -j8

cd ../jni
cp /opt/homebrew/Cellar/libomp/14.0.6/lib/libomp.a .
make -j8 -f Makefile.mac

cd ..
mvn clean package -pl cpu-demo -am
java -cp cpu-demo/target/cpu-demo-0.0.1.jar com.gameofdimension.faiss.tutorial.OneFlat

## reference

- https://github.com/adamheinrich/native-utils

- https://github.com/thenetcircle/faiss4j