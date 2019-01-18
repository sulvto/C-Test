#!/bin/bash

MODULE=$1
TIME=`date "+%Y%m%d%H%M"`
GIT_REVISION=`git log -1 --pretty=format:"%h"`
IMAGE_NAME=hub.qinchao.me/microservice/${MODULE}:${TIME}_${GIT_REVISION}

cd ${MODULE}

docker build -t ${IMAGE_NAME} .
cd -


docker push ${IMAGE_NAME}
