package com.xa.sc_eureka_consume2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClients   // 使用ribbon负载均衡
public class ScEurekaConsume2Application {

    public static void main(String[] args) {
        SpringApplication.run(ScEurekaConsume2Application.class, args);
    }

}
