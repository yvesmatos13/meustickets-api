# Etapa 1: build com Maven em container
FROM maven:3.9-eclipse-temurin-17 AS builder

# Clone do repositório diretamente (se preferir, copie o projeto localmente)
WORKDIR /app

COPY . .

# Faz o build do projeto (gera o .jar na pasta target)
RUN mvn clean install -DskipTests

# Etapa 2: imagem leve só com o JAR
FROM eclipse-temurin:17-jdk-alpine

# Define a porta de exposição
EXPOSE 8080

# Copia o .jar gerado na imagem anterior
COPY --from=builder /app/target/*.jar /app/app.jar

# Define o comando para rodar o Spring Boot
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
