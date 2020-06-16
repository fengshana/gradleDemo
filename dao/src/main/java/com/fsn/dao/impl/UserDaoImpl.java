package com.fsn.dao.impl;

import com.fsn.dao.UserDao;
import org.springframework.stereotype.Service;


@Service
public class UserDaoImpl implements UserDao {
    @Override
    public String save() {
        return "保存成功！";
    }
}
