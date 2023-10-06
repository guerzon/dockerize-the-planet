FROM maven:3.9-eclipse-temurin-17 AS builder

WORKDIR /app
COPY src/main/java/com/demolopolis/springboot/Application.java \
    src/main/java/com/demolopolis/springboot/Application.java
COPY pom.xml .
RUN mvn clean -DskipTests package

COPY . .
RUN mvn clean -DskipTests package

FROM eclipse-temurin:17-alpine

WORKDIR /app
COPY --from=builder /app/target/*.jar ./app.jar

EXPOSE 8999
ENTRYPOINT [ "java", "-jar", "/app/app.jar"]
