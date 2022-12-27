package com.Icy.service;

import com.Icy.dao.UserDao;
import com.Icy.dao.UserDaoImpl;
import com.Icy.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{
//    public UserDao userDao = new UserDaoImpl();
// 利用set进行动态实现值得注入
    public UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser(){
        userDao.getUser();
    }

}
