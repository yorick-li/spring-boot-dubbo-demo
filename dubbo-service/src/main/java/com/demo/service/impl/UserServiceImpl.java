package com.demo.service.impl;

import com.demo.service.IUserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class UserServiceImpl implements IUserService {

    @Override
    public String sayHello() {
        return "Hello, Spring Boot Dubbo ~!";
    }

}
