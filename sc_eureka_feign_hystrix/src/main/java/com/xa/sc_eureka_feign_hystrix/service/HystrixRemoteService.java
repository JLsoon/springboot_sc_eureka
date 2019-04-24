package com.xa.sc_eureka_feign_hystrix.service;

import com.xa.sc_eureka_feign_hystrix.service.impl.HystrixRemoteServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author:JLsoon
 * @createTime:2019-04-23 10-33
 */
//当远程服务调用失败时回调HystrixRemoteServiceImpl的实现
@FeignClient(name = "eureka-provider",fallback = HystrixRemoteServiceImpl.class)
public interface HystrixRemoteService {
    @RequestMapping("hello")
    public String getInfo(@RequestParam("name") String name);
}
