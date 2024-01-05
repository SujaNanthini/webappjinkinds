FROM eclipse-temurin:17
COPY target/webappjinkinds.jar webappjinkinds.jar
CMD [ "java","-jar","webappjinkinds.jar" ]