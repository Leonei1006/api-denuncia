FROM openjdk:17-alpine
WORKDIR /denuncia
COPY target/*.jar /denuncia/appdenuncia.jar
CMD java -XX:+UseContainerSupport -jar appdenuncia.jar
