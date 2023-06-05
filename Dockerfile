FROM openjdk:17
EXPOSE 8080
ADD ./target/k8s.jar k8s.jar
ENTRYPOINT ["java","-jar","/k8s.jar"]