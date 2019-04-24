package com.xa.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author:JLsoon
 * @createTime:2019-04-22 16-59
 */
@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 2397494548947736707L;
    private Integer userid;
    private String loginName;
    private String password;
    private Byte state;
    private Date dateTime;
    private String realname;
}
