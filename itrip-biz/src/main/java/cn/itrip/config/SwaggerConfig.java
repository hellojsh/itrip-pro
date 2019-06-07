package cn.itrip.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger 配置类
 * @author hellojsh
 * @create 2019-06-07 18:22
 */
@EnableSwagger2
@ComponentScan("cn.itrip.controller")
@Configuration
public class SwaggerConfig extends WebMvcConfigurationSupport {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                // 控制哪些接口暴露给 Swagger 展现
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("爱旅行-主业务模块API")
                .termsOfServiceUrl("http://www.itrip.com/biz/")
                .contact(new Contact("JT1814项目组", null, null))
                .version("1.0")
                .build();
    }
}
