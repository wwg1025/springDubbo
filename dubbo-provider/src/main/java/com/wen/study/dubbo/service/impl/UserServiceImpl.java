package com.wen.study.dubbo.service.impl;

import com.wen.study.dubbo.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public String getName(String userId) {
        return "lxj" + userId;
    }
}
