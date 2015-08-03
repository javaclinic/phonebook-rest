# phonebook-rest
Phonebook REST Application



## Known Branches
* `master` - initial branch, empty
* `springboot-springrest` - Spring Boot + Spring Data + Spring REST implenentation of Phonebook REST application
* `springboot-springrest-with-ssl` - Spring Boot + Spring Data + Spring REST implenentation of Phonebook REST application + Tomcat SSL Connector
* `springboot-jersey` - Spring Boot + Spring Data + Spring Jersey implementation of Phonebook REST application
* `springboot-jersey-with-ssl` - Spring Boot + Spring Data + Spring Jersey implementation of Phonebook REST application + Tomcat SSL Connector


## springboot-springrest
* Spring Boot, Spring Data, Spring REST implementation
* How to run
```
mvn clean package
java -jar target/phonebook-rest-1.0.0-SNAPSHOT.jar
CTRL+C to STOP the application
```
* How to use application
```
http://localhost:8080/
http://localhost:8080/entries
http://localhost:8080/entries/1
http://localhost:8080/health
http://localhost:8080/metrics
http://localhost:8080/dump
http://localhost:8080/trace
```
* Alternatively, you could start the application on arbitrary port, e.g. `9000`
```
java -Dport=9000 -jar target/phonebook-rest-1.0.0-SNAPSHOT.jar
```

## springboot-springrest-with-ssl
* Spring Boot, Spring Data, Spring REST implementation, Tomcat Java SSL Connector
* How to run
```
keytool -genkey -alias tomcat.alias -keyalg RSA -keysize 2048 -keystore keystore.jks -validity 3650 -dname "CN=training.javaclinic.com, OU=IT, O=JavaClinic, L=San Francisco, S=CA, C=US" -storepass keystore.password -keypass key.passwordmvn clean package
mvn clean package
java -jar target/phonebook-rest-1.0.0-SNAPSHOT.jar
CTRL+C to STOP the application
```
* How to use application
```
https://localhost:8443/
https://localhost:8443/entries
https://localhost:8443/entries/1
https://localhost:8443/health
https://localhost:8443/metrics
https://localhost:8443/dump
https://localhost:8443/trace
```
* Alternatively, you could start the application on arbitrary port, e.g. `9000`
```
java -Dport=9000 -jar target/phonebook-rest-1.0.0-SNAPSHOT.jar
```


## springboot-jersey
* Spring Boot, Spring Data, Jersey REST implementation
* How to run
```
mvn clean package
java -jar target/phonebook-rest-1.0.0-SNAPSHOT.jar
CTRL+C to STOP the application
```
* How to use application
```
http://localhost:8080/entries
http://localhost:8080/entries/1
```
* Alternatively, you could start the application on arbitrary port, e.g. `9000`
```
java -Dport=9000 -jar target/phonebook-rest-1.0.0-SNAPSHOT.jar
```

## springboot-jersey-with-ssl
* Spring Boot, Spring Data, Jersey REST implementation, Tomcat Java SSL Connector
* How to run
```
keytool -genkey -alias tomcat.alias -keyalg RSA -keysize 2048 -keystore keystore.jks -validity 3650 -dname "CN=training.javaclinic.com, OU=IT, O=JavaClinic, L=San Francisco, S=CA, C=US" -storepass keystore.password -keypass key.passwordmvn clean package
mvn clean package
java -jar target/phonebook-rest-1.0.0-SNAPSHOT.jar
CTRL+C to STOP the application
```
* How to use application
```
https://localhost:8443/entries
https://localhost:8443/entries/1
```
* Alternatively, you could start the application on arbitrary port, e.g. `9000`
```
java -Dport=9000 -jar target/phonebook-rest-1.0.0-SNAPSHOT.jar
```
