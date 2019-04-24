package com.xa.sc_eureka_feign_hystrix.service.impl;

import com.xa.sc_eureka_feign_hystrix.service.HystrixRemoteService;
import org.springframework.stereotype.Service;

/**
 * @author:JLsoon
 * @createTime:2019-04-23 10-42
 */
@Service
public class HystrixRemoteServiceImpl implements HystrixRemoteService {
    @Override
    public String getInfo(String name) {
        return "welcome to Feign and Hystrix world";
    }
}
