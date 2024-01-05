package com.wen.study.service;

import com.wen.study.entity.TestUser;

import java.util.List;

public interface TestUserService {
    TestUser getUserById(int id);

    boolean regist(String username, String password);

    boolean login(String username, String password);

    List<TestUser> selectAll();
}
