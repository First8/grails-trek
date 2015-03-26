#!/bin/bash
DIR=`pwd`
PROJECT="trek"

mkdir -p "${DIR}/target"

echo "windows ..."
#rm -f "${DIR}/target/trek-windows.zip" && \
#zip -1uqry "$DIR/target/trek-windows.zip" changedFiles ggts-bundle-win32-i586 prepare.bat workspace resources/sed-win32

echo "linux ..."
#rm -f "${DIR}/target/trek-linux.zip"
#zip -1uqry "${DIR}/target/trek-linux.zip" changedFiles ggts-bundle-linux-x64 prepare.sh workspace

echo "mac ..."
#rm -f "${DIR}/target/trek-mac.zip" && \
#zip -1uqry "${DIR}/target/trek-mac.zip" changedFiles ggts-bundle-osx-x64 prepare.sh workspace

echo "adding project ..." 
pushd ./..
   zip -rq "${DIR}/target/trek-windows.zip" ${PROJECT}
   zip -rq "${DIR}/target/trek-linux.zip" ${PROJECT}
   zip -rq "${DIR}/target/trek-mac.zip" ${PROJECT}
popd
