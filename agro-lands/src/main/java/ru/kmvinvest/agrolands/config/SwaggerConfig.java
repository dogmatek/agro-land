package ru.kmvinvest.agrolands.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class SwaggerConfig implements WebMvcConfigurer {


    @Bean
    public OpenAPI registrationOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("AgroLands API")
                                .description("REST API ")
                );
    }
}
