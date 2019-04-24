package com.xa.sc_eureka_consume2.service.impl;

import com.xa.pojo.UserInfo;
import com.xa.sc_eureka_consume2.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author:JLsoon
 * @createTime:2019-04-22 14-38
 */
@Service
public class RemoteServiceImpl implements RemoteService {
    @Autowired
    private RestTemplate restTemplate; //注入远程服务（其中封装了httpclient）
    /*@Autowired
    @Qualifier("remoteRestTemplate")
    private RestTemplate rest;*/
    @Override
    public String fetchInfo(String name) {
        String object = restTemplate.getForObject("http://eureka-provider/hello?name=" + name, String.class);
        return object;
    }

    @Override
    public List<UserInfo> getAllUserInfo() {
        return restTemplate.getForObject("http://eureka-provider/selectAllUserInfo", List.class);
    }

    @Override
    public String fetchInfoChenyouming(String name) {
        return restTemplate.getForObject("http://eureka-provider/hello?name="+name,String.class);
    }

}
