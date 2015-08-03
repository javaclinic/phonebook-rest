#!/bin/bash

KEYTOOL=`which keytool`

# ${KEYTOOL} -genkey -storetype PKCS12 -alias tomcat.alias -keyalg RSA -keysize 2048 -keystore keystore.p12 -validity 3650 -dname "CN=training.javaclinic.com, OU=IT, O=JavaClinic, L=San Francisco, S=CA, C=US" -storepass keystore.password 

${KEYTOOL} -genkey -alias tomcat.alias -keyalg RSA -keysize 2048 -keystore keystore.jks -validity 3650 -dname "CN=training.javaclinic.com, OU=IT, O=JavaClinic, L=San Francisco, S=CA, C=US" -storepass keystore.password -keypass key.password
