package com.wen.study.test;

import com.wen.study.dubbo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class StartConsumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/dubbo/springDubbo-consumer.xml");
        context.start();
        System.out.println("消费者已经启动...");
        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.getPermissions(111L));
        System.in.read();
    }
}
