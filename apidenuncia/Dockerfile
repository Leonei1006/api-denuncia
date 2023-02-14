FROM openjdk:17-alpine
WORKDIR /apidenuncia
COPY target/*.jar /apidenuncia/appdenuncia.jar
CMD java -XX:+UseContainerSupport -jar appdenuncia.jar
EXPOSE 8080
