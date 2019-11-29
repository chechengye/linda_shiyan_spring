package com.weichuang.test;

import com.weichuang.pojo.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.weichuang.pojo.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpring {

    @Autowired
    Order order;
    @Test
    public void testFn(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User user = (User)applicationContext.getBean("user");
        //User user2 = (User)applicationContext.getBean("user");
        System.out.println(user);
    }
    @Test
    public void testFn1(){
        //User user2 = (User)applicationContext.getBean("user");
        System.out.println(order);
        //applicationContext.close();
    }

}
