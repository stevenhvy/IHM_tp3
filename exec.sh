#!/bin/bash

javac -d bin/ --module-path /usr/share/openjfx/lib/ --add-modules javafx.controls src_etu/*.java

java -cp bin:img --module-path /usr/share/openjfx/lib/ --add-modules javafx.controls FenetreConsultation