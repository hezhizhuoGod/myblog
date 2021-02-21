package com.godz.myblog.service.Impl;

import com.godz.myblog.dao.UserDao;
import com.godz.myblog.entity.User;
import com.godz.myblog.service.UserService;
import com.godz.myblog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author :Godz
 * @description :用户业务层接口实现类
 * @date: 2021-02-17 11:59
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    //username 用户名 password:密码
    //return 返回用户对象
    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
