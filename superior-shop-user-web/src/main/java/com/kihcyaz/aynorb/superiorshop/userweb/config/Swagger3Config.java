package com.kihcyaz.aynorb.superiorshop.userweb.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class Swagger3Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();

    }



    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("superior shop use web application api documentation")
                .description("superior shop use web application api documentation")
                .contact(
                        new Contact(
                        "kihcyaZaynorB",
                        "https://github.com/kihcyaZaynorB",
                                "aynorbklihcyaz@outlook.com"
                        )
                )
                .version("1.0")
                .build();
    }
}
