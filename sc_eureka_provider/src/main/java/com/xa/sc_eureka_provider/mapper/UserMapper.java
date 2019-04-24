package com.xa.sc_eureka_provider.mapper;


import com.xa.pojo.UserInfo;

import java.util.List;

/**
 * @author:JLsoon
 * @createTime:2019-04-22 16-59
 */
public interface UserMapper {
    public List<UserInfo> selectAllUserInfo();
}
