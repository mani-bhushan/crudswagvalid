package com.apps.org.configurations;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI crusSwagValidOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("CRUD Swag Valid")
                        .description("Spring Boot JPA + H2 database example - CRUD Rest Apis with swagger and validation")
                        .version("2.0")
                        .license(new License().name("Apache 2.0").url("http://www.apache.org/licenses/LICENSE-2.0")))
                .externalDocs(new ExternalDocumentation()
                        .description("Mani Bhushan, bhushan.mani.mishra@gmail.com")
                        .url("http://com.apps.org.com"));
    }

}