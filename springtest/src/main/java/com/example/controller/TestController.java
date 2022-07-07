package com.example.controller;

import com.example.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private User user;

    @RequestMapping("/user")
    public User user(){
        user.setName("zs");
        user.setId(1);
        user.setAddress("zg");
        return user;
    }




}
