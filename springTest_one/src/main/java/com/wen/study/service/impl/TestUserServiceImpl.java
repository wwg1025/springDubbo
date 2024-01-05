package com.wen.study.service.impl;

import com.wen.study.dao.TestUserMapper;
import com.wen.study.entity.TestUser;
import com.wen.study.service.TestUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class TestUserServiceImpl implements TestUserService {
        @Autowired
        private TestUserMapper testUserMapper;

        public TestUser getUserById(int id) {
            // TODO Auto-generated method stub
            return this.testUserMapper.selectByPrimaryKey(id);
        }

        @Override
        public boolean regist(String username, String password) {
            System.out.println("==========");
            System.out.println("userServiceImpl, regist: " + username + password);
            System.out.println("输入的账号:" + username + "输入的密码:" + password);
            if (username==""||password=="") {
                return false;
            }else {
                testUserMapper.addUser(username, password);
                return true;
            }
        }

        @Override
        public boolean login(String username, String password) {
            System.out.println("==========");
            System.out.println("userServiceImpl, login: " + username + password);
            System.out.println("输入的账号:" + username + "输入的密码:" + password);
            TestUser user = testUserMapper.findUserByNameAndPwd(username, password);
            if (user != null) {
                if (user.getUserName().equals(username) && user.getUserPassword().equals(password)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public List<TestUser> selectAll() {
            return this.testUserMapper.selectAll();
        }
}
