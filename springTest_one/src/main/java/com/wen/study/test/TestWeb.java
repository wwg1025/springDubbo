package com.wen.study.test;

import com.alibaba.fastjson.JSON;
import com.wen.study.entity.TestUser;
import com.wen.study.service.TestUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml", "classpath:spring/spring-datasource.xml"})
public class TestWeb {
    private static Logger logger = Logger.getLogger(TestWeb.class);
    @Autowired
    private TestUserService userService;

    @Test
    public void test1() {
        System.out.println("test1");
        TestUser user = userService.getUserById(1);
        logger.info(JSON.toJSONString(user));
    }
}
