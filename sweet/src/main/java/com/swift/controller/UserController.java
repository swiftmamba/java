package com.swift.controller;

import com.swift.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author swift
 * @version 1.0
 * @description: TODO
 * @date 2021/5/25 11:50
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    @ResponseBody
    public List<User> getUserList(){
        List<User> userList = userService.getUserList();
        return userList;
    }
}
