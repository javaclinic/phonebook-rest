# phonebook-rest
Phonebook REST Application



## Known Branches
* `master` - initial branch, empty
* `springboot-springrest` - Spring Boot + Spring Data + Spring REST implenentation of Phonebook REST application



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
