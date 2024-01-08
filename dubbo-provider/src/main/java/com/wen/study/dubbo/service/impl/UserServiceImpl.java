package com.wen.study.dubbo.service.impl;

import com.wen.study.dubbo.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getName(String userId) {
        return "lxj" + userId;
    }
}
