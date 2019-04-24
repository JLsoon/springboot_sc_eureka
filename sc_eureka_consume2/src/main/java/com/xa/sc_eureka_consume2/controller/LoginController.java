package com.xa.sc_eureka_consume2.controller;

import com.xa.sc_eureka_consume2.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:JLsoon
 * @createTime:2019-04-22 14-35
 */
@RestController
public class LoginController {
    @Autowired
    private RemoteService remoteService;

    @RequestMapping(value = "/login")
    public String login(@RequestParam(value = "name")String name){
        return remoteService.fetchInfo(name);
    }

    @RequestMapping(value = "/getAllUserInfo")
    public Object getAllUserInfo(){
        return remoteService.getAllUserInfo();
    }

    @RequestMapping(value = "/loginChenyouming")
    public String loginChenyouming(String name){
        return remoteService.fetchInfoChenyouming(name);
    }
}
