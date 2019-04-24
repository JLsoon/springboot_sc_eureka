package com.xa.sc_eureka_provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient   //标识此服务为一个提供者
@MapperScan("com.xa.sc_eureka_provider.mapper")
public class ScEurekaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScEurekaProviderApplication.class, args);
    }

}
