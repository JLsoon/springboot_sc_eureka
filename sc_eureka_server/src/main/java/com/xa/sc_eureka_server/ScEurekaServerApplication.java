package com.xa.sc_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer    //标识此服务为注册中心
public class ScEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScEurekaServerApplication.class, args);
    }

}
