package com.xa.sc_eureka_ribbon_hystrix.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xa.sc_eureka_ribbon_hystrix.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @author:JLsoon
 * @createTime:2019-04-23 11-22
 */
@Service
public class RibbonHystrixServiceImpl implements RibbonHystrixService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hystrixError")
    public String hello(String name) {
        return restTemplate.getForObject("http://eureka-provider/hello?name="+name,String.class);
    }

    private String hystrixError(String name) {
        return "error"+name;
    }
}
