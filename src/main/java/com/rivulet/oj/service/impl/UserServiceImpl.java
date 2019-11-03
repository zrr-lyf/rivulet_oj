package com.rivulet.oj.service.impl;

import com.rivulet.oj.mapper.UserMapper;
import com.rivulet.oj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
}
