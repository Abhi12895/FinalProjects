FROM amazoncorretto:17.0.7-alpine
 
EXPOSE 7865
ADD target/boot-docker-tcs.jar boot-docker-tcs.jar
ENTRYPOINT [ "java","-jar","/boot-docker-tcs.jar"]