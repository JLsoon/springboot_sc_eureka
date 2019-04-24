package com.xa.sc_eureka_provider.controller;

import com.xa.pojo.UserInfo;
import com.xa.sc_eureka_provider.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam("name") String name){
        return name+",welcome to spring cloud world";
    }

    @RequestMapping(value = "/selectAllUserInfo")
    public List<UserInfo> selectAllUserInfo(){
        return userInfoService.selectAllUserInfo();
    }
}
