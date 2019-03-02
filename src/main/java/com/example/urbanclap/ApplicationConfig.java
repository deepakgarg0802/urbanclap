package com.example.urbanclap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*Read from https://dzone.com/articles/spring-boot-restful-api-documentation-with-swagger*/


@Configuration
@EnableSwagger2
public class ApplicationConfig {
	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.basePackage(getClass().getPackage().getName()))
                //.paths(regex("/product.*"))
                .build();
    }
    
    @Bean
    public UiConfiguration uiConfig() {
        return new UiConfiguration(null);
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Simple Urbanclap like API")
                .description("API to make and consume tasks")
                .version("1.0")
                .build();
    }
}
