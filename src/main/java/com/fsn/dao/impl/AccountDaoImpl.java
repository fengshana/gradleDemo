package com.fsn.dao.impl;

import com.fsn.dao.AccountDao;

import java.util.List;

public class AccountDaoImpl implements AccountDao {
    @Override
    public List findAll() {
        System.out.println("AccountDao - [findAll]: 列表查询成功！");
        return null;
    }
}
