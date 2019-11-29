package com.weichuang.proxy;

import com.weichuang.pojo.User;

public interface UserService {
    void addUser(User user);
    User getUserById(int id);
}
