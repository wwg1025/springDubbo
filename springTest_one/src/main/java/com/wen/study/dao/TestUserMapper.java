package com.wen.study.dao;

import com.wen.study.entity.TestUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestUserMapper {

    TestUser getUserById(int id);

    TestUser selectByPrimaryKey(int id);

    int addUser(String username, String password);

    TestUser findUserByNameAndPwd(String username, String password);

    //boolean regist(String username, String password);

    //boolean login(String username, String password);

    List<TestUser> selectAll();
}
