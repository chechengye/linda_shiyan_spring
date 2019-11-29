package com.weichuang.proxy;

import com.weichuang.pojo.User;

public class UserServiceImpl implements UserService{
    @Override
    public void addUser(User user) {
        System.out.println("增加用户");
    }

    @Override
    public User getUserById(int id) {
        System.out.println("查询一个用户");
        return null;
    }
}
