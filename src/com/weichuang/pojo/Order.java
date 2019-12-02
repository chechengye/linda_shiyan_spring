package com.weichuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.io.Serializable;

//@Component
public class Order implements Serializable{

    //@Value("26536256326")
    private String orderNo;
    //@Value("2019-11-13")
    private String createTime;

   /*
    @Qualifier(value = "user1")*/
    //@Resource(name = "user1")
    @Autowired
    private User user;

    public String getOrderNo() {
        return orderNo;
    }
    @Value("26536256326")
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCreateTime() {
        return createTime;
    }
    @Value("2019-11-13")
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化方法!!!");
    }

    @PreDestroy
    public void destory(){
        System.out.println("销毁方法!!!");
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo='" + orderNo + '\'' +
                ", createTime='" + createTime + '\'' +
                ", user=" + user +
                '}';
    }
}
