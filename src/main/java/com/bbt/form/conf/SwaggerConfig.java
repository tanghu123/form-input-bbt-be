package com.bbt.form.conf;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI springFormAPI() {
    return new OpenAPI()
        .info(
            new Info()
                .title("表单录入系统")
                .description("表单录入系统API文档")
                .version("v1")
                .license(new License().name("Apache 2.0").url("http://springdoc.org")))
        .externalDocs(new ExternalDocumentation().description("外部文档").url("http://springdoc.org"));
  }
}
