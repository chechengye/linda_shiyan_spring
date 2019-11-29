package com.weichuang.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserProxyFactory implements InvocationHandler{
    private UserService us;

    public UserProxyFactory(UserService us) {
        this.us = us;
    }

    public  UserService getUserService(){
        UserService userService = (UserService) Proxy.newProxyInstance(UserProxyFactory.class.getClassLoader(), UserService.class.getInterfaces(), UserProxyFactory.this);
        return userService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("增强前的方法");
        Object invoke = method.invoke(proxy, args);
        System.out.println("增强后的方法");
        return invoke;
    }
}
