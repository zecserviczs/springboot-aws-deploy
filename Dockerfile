FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /temp
EXPOSE 8080
ADD target/springboot-aws-deploy-service.jar springboot-aws-deploy-service.jar
ENTRYPOINT ["java","-jar","/springboot-aws-deploy-service.jar"]