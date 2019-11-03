package com.rivulet.oj.controller;


import com.rivulet.oj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("rivulet/oj/api/user")
public class UserController {

    @Autowired
    private UserService userService;

}
