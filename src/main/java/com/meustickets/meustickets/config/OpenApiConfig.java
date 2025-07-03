package com.meustickets.meustickets.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Meustickets API",
        version = "1.0",
        description = "API REST para gestão de eventos e ingressos",
        contact = @Contact(name = "Yves Matos", email = "yvesmatos13@gmail.com", url = "http://localhost:8080/"),
        license = @License(name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0.html")
    )
)
public class OpenApiConfig {

}
