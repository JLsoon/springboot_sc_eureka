package com.xa.sc_eureka_ribbon_hystrix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @author:JLsoon
 * @createTime:2019-04-23 11-21
 */
public interface RibbonHystrixService {
    public String hello(@RequestParam("name") String name);
}
