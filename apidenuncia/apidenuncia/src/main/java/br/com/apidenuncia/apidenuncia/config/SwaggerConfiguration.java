package br.com.apidenuncia.apidenuncia.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(info =
@Info(title = "API Denúncias",
        version = "v1",
        description = "API de denúncias para abrir ordem de serviço."))
@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .components(new Components())
            .info(
                new io.swagger.v3.oas.models.info.Info()
                    .title("API Configurações")
                    .version("v1")
                    .license(new License()
                    .name("Apache 2.0")
                    .url("http://springdoc.org"))
            );
    }
}