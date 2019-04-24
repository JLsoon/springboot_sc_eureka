package com.xa.sc_eureka_feign_hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients    //feign提供负载均衡
@EnableHystrix   //开启熔断器(启动熔断降级服务)
public class ScEurekaFeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScEurekaFeignHystrixApplication.class, args);
    }

}
