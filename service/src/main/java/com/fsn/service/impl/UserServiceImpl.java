package com.fsn.service.impl;

import com.fsn.dao.UserDao;
import com.fsn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String save() {
        return userDao.save();
    }
}
