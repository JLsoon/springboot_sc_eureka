package com.xa.sc_eureka_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableDiscoveryClient    //标识此服务为消费者
@EnableFeignClients   //以feign实现调用的负载均衡
public class ScEurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScEurekaConsumerApplication.class, args);
    }

}
