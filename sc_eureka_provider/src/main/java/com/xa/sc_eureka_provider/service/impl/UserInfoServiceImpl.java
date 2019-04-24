package com.xa.sc_eureka_provider.service.impl;

import com.xa.pojo.UserInfo;
import com.xa.sc_eureka_provider.mapper.UserMapper;
import com.xa.sc_eureka_provider.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:JLsoon
 * @createTime:2019-04-22 17-00
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<UserInfo> selectAllUserInfo() {
        return userMapper.selectAllUserInfo();
    }
}
