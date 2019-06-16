package com.gwq.cnotf.configuratiom;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 22:32 2019/06/13
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * swagger 文档地址 http://127.0.0.1:8083/gwq/swagger-ui.html
     * @return
     */
    @Bean
    public Docket swaggerSpringMvcPlugin() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).build();
    }
}
