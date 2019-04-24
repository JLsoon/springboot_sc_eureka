package com.xa.sc_eureka_consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-provider")
public interface RemoteService {

    @RequestMapping(value = "/hello")
    public String getInfo(@RequestParam(value = "name") String name);

}
