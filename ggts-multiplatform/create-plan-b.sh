#!/bin/bash

rm -f ./target/plan-b.zip
mkdir -p ./target
zip -1uqry ./target/plan-b.zip changedFiles *.sh *.bat workspace resources
