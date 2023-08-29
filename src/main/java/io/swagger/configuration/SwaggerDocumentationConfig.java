package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-08-29T01:47:25.669195809Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Todolist RESTful API")
            .description("OpenAPI for Todolist RESTful API")
            .license("APACHE 2.0")
            .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
            .termsOfServiceUrl("https://www.danialfach.my.id")
            .version("1")
            .contact(new Contact("","", "danialfacrudin@gmail.com"))
            .build();
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("Todolist RESTful API")
                .description("OpenAPI for Todolist RESTful API")
                .termsOfService("https://www.danialfach.my.id")
                .version("1")
                .license(new License()
                    .name("APACHE 2.0")
                    .url("https://www.apache.org/licenses/LICENSE-2.0"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("danialfacrudin@gmail.com")));
    }

}
