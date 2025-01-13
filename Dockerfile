FROM openjdk:21
COPY target/*.jar deployment/app.jar
COPY startup/*.sh deployment/start.sh
ENTRYPOINT ["sh","deployment/start.sh"]