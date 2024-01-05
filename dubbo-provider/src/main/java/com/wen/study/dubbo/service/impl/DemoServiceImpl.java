package com.wen.study.dubbo.service.impl;

import com.wen.study.dubbo.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {

    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id));
        return demo;
    }

}
