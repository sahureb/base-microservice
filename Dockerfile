FROM openjdk:21-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} deployment/${JAR_FILE}
ENTRYPOINT ["java","-jar","deployment/${JAR_FILE}"]