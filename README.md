# spring-boot-demo

using spring boot to learn all new kinds of stuff

Rest-assured - https://semaphoreci.com/community/tutorials/testing-rest-endpoints-using-rest-assured

Spring Boot Stack - https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/

Docker with spring boot -https://spring.io/guides/gs/spring-boot-docker/ to learn about dockerizing a spring boot app

## Sample REST application that deals with a garage. The garage has 150 spaces for cars. Its API can be summarized as follows:
- GET call at /garage returns information of filled/free car parking slots,
- POST call at /garage/slots parks a new car at the next free parking slot,
- PUT call at /garage/slots/{slotID} parks a car at a specific parking slot,
- GET call at /garage/slots/{slotID} gives information on the availability of a specific slot, and
- DELETE call at garage/slots/{slotID} empties that slot (the car leaves the garage).
