package com.xa.sc_eureka_consume2.service;


import com.xa.pojo.UserInfo;

import java.util.List;

/**
 * @author:JLsoon
 * @createTime:2019-04-22 14-37
 */
public interface RemoteService {
    public String fetchInfo(String name);

    public List<UserInfo> getAllUserInfo();

    public String fetchInfoChenyouming(String name);
}
