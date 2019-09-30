FROM openjdk:8
ENV PARAMS=""
MAINTAINER "Cleberson Pedreira Pauluci"
VOLUME ~/docker-volumes/springbootdocker-demo
ADD target/springbootdocker-demo.jar demo.jar
RUN bash -c 'touch /demo.jar'
ENTRYPOINT exec java $PARAMS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=container -jar demo.jar
EXPOSE 8080