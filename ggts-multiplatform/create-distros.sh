#!/bin/bash
mkdir -p ./target

echo "linux ..."
rm -f ./target/trek-linux.zip

zip -1uqry ./target/trek-linux.zip changedFiles ggts-bundle-linux-x64 prepare.sh workspace
echo "windows ..."
rm -f ./target/trek-windows.zip
zip -1uqry ./target/trek-windows.zip changedFiles ggts-bundle-win32-i586 sed-win32 prepare.bat workspace
echo "mac ..."
rm -f ./target/trek-mac.zip
zip -1uqry ./target/trek-mac.zip changedFiles ggts-bundle-osx-x64 prepare.sh workspace
