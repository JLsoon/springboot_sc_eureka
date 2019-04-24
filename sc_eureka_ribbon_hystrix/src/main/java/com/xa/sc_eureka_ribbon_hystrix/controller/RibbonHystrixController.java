package com.xa.sc_eureka_ribbon_hystrix.controller;

import com.xa.sc_eureka_ribbon_hystrix.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:JLsoon
 * @createTime:2019-04-23 11-20
 */
@RestController
public class RibbonHystrixController {
    @Autowired
    RibbonHystrixService ribbonHystrixService;
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam("name")String name) {
        return ribbonHystrixService.hello(name);
    }
}
