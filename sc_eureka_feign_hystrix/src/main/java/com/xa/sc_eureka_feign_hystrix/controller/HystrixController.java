package com.xa.sc_eureka_feign_hystrix.controller;

import com.xa.sc_eureka_feign_hystrix.service.HystrixRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:JLsoon
 * @createTime:2019-04-23 10-32
 */
@RestController
public class HystrixController {
    @Autowired
    private HystrixRemoteService remoteService;

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam("name")String name){
        return remoteService.getInfo(name);
    }
}
