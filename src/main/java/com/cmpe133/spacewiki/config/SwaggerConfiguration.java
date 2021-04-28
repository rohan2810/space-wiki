package com.cmpe133.spacewiki.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket spacewikiApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfor());
    }

    private ApiInfo getApiInfor() {
        return new ApiInfoBuilder()
                .title("Space Wiki")
                .version("1.0")
                .description("API for space wiki application")
                .contact(new Contact("Rohan Surana", "https://www.linkedin.com/in/rohan-surana/", "rohansurana2810@gmail.com"))
                .license("Apache Licence Version 2.0")
                .build();
    }
}
