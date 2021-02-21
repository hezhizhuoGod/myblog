package com.godz.myblog.service;

import com.godz.myblog.entity.User;

/**
 * @author :Godz
 * @description :用户业务层接口
 * @date: 2021-02-17 11:58
 **/
public interface UserService {
    //核对用户名和密码
    User checkUser(String username, String password);
}
