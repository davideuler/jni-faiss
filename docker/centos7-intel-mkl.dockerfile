FROM centos:7
## base image for intel-mkl on centos 7
## docker build -t centos-7-mkl:202201 -f Centos7.mkl.Dockerfile .

ENV LANG en_US.UTF-8
ENV LC_ALL en_US.UTF-8

# RUN yum install -y lapack lapack-devel gcc-c++ make swig

RUN yum-config-manager --add-repo https://yum.repos.intel.com/mkl/setup/intel-mkl.repo
RUN yum install -y intel-mkl && rm -rf /opt/intel/compilers_and_libraries_2020.4.304/linux/mkl/lib/ia32_lin/

