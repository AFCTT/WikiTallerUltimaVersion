# Usa una imagen base de Java
FROM openjdk:17-jdk-slim

COPY . /app
WORKDIR /app
RUN ./mvnw clean install -DskipTests

# Copia el archivo JAR al contenedor
#COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

# Define el comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]

# Exponer el puerto en el que la aplicación escuchará
EXPOSE 8080