package com.atguigu.gmall0901.service;

import com.atguigu.gmall0901.bean.UserAddress;
import com.atguigu.gmall0901.bean.UserInfo;

import java.util.List;

public interface UserService {

    /**
     * 查询所有用户
     * @return
     */
    List<UserInfo> findAll();


    //调用根据用户Id查询用户的地址
    List<UserAddress> findUserAddressByUserId(String userId);
}
