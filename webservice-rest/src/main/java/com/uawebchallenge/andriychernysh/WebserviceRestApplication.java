package com.uawebchallenge.andriychernysh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.integration.annotation.IntegrationComponentScan;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.uawebchallenge.andriychernysh")
@EnableSwagger2
@EnableAutoConfiguration(exclude = {JmxAutoConfiguration.class})
@IntegrationComponentScan
public class WebserviceRestApplication {

    public static void main(final String[] args) {
        SpringApplication.run(WebserviceRestApplication.class, args);
    }

    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(WebserviceRestApplication.class);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
