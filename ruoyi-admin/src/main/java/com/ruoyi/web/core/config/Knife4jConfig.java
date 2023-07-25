package com.ruoyi.web.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author ckl
 * @since 2023/7/24 9:34
 */
@Configuration
public class Knife4jConfig {

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket = new Docket(DocumentationType.OAS_30)
                .apiInfo(new ApiInfoBuilder()
                        .description("Knife4j 接口文档示例")
                        .title("Knife4j 接口文档")
                        .version("1.0")
                        .build())
                .groupName("默认接口")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ruoyi.web.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
