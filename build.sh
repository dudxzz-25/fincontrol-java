#!/usr/bin/env sh
set -e
rm -rf out
mkdir -p out
javac -d out src/com/eduardo/fincontrol/*.java
echo "Build concluído. Execute: java -cp out com.eduardo.fincontrol.Main"
