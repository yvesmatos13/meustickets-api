# Etapa 1: build com Maven em container
FROM maven:3.9-eclipse-temurin-17 AS builder

# Clone do repositório diretamente (se preferir, copie o projeto localmente)
RUN git clone https://github.com/yvesmatos13/meustickets-api.git /app
WORKDIR /app

# Faz o build do projeto (gera o .jar na pasta target)
RUN mvn clean package -DskipTests

# Etapa 2: imagem leve só com o JAR
FROM eclipse-temurin:17-jdk-alpine

# Define a porta de exposição
EXPOSE 8080

# Copia o .jar gerado na imagem anterior
COPY --from=builder /app/target/*.war /app/app.war

# Define o comando para rodar o Spring Boot
ENTRYPOINT ["java", "-jar", "/app/app.war"]
