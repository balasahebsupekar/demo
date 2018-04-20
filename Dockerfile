FROM java:latest
COPY . /home/supekar_b
WORKDIR /home/supekar_b
CMD ["/bin/echo", "demo 1 Test"]
CMD java -version
CMD java -jar cr-rest-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
