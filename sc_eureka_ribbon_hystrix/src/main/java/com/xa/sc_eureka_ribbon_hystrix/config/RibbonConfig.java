package com.xa.sc_eureka_ribbon_hystrix.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author:JLsoon
 * @createTime:2019-04-22 14-34
 */
@Configuration
public class RibbonConfig {

    @Bean(name = "remoteRestTemplate")
    @LoadBalanced   //标识为负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
