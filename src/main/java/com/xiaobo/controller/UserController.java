package com.xiaobo.controller;

import com.xiaobo.model.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luxiaobo on 2017/5/9.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private ConfigBean configBean;
    @Value("${username}")
    private String userName;

    @RequestMapping("/hello")
    public  String satHello() {
        return configBean.getName() + configBean.getWant() + userName;
    }
}
