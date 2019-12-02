package com.weichuang.proxy;

import com.weichuang.pojo.User;

public class UserServiceImpl implements UserService{
    @Override
    public void addUser() {
        System.out.println("增加用户");
    }

    @Override
    public void getUserById() {
        System.out.println("查询一个用户");
    }
}
