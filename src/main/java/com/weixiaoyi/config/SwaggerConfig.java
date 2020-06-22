package com.weixiaoyi.config;

import cn.hutool.core.net.NetUtil;
import com.weixiaoyi.bean.DocConfigProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import javax.annotation.Resource;

/**
 * @author ：yuanLong Wei
 * @date ：Created in 2019/5/16 10:40
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Configuration
@EnableSwagger2
@Slf4j
public class SwaggerConfig {

    @Resource
    private Environment env;

    @Resource
    private DocConfigProperties docConfigProperties;

    /**
     * 添加摘要信息(Docket)
     */
    @Bean
    public Docket initConfigApi() {
        String localhostAdd = NetUtil.getLocalhostStr();
        String serverPort = env.getProperty("server.port");
        String applicationName = env.getProperty("spring.application.name");
        String contextPath = env.getProperty("server.servlet.context-path");
        if(contextPath == null || "/".equals(contextPath))
            contextPath = "";

        log.info("- - - - - -  {},的文档地址为：http://{}:{}{}/doc.html - - - - - - -",applicationName,localhostAdd,serverPort,contextPath);

        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title(docConfigProperties.getTitle());
        apiInfoBuilder.description(docConfigProperties.getDescription());
        apiInfoBuilder.contact(new Contact(docConfigProperties.getAuthor(), docConfigProperties.getUrl(), docConfigProperties.getEmail()));
        apiInfoBuilder.version(docConfigProperties.getVersion());
        docket.apiInfo(apiInfoBuilder.build());
        docket.groupName(docConfigProperties.getGroupName());
        docket.select().apis(RequestHandlerSelectors.basePackage("com.weixiaoyi.controller")).paths(PathSelectors.any()).build();
        return docket;
    }

}
