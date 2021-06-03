package com.swift.service.impl;

import com.swift.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author swift
 * @version 1.0
 * @description: TODO
 * @date 2021/5/25 11:45
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 开启事务，遇到exception回滚操作
     *
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<User> getUserList() {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        List<User> list = userMapper.selectByExample(example);
        return list;
    }
}
