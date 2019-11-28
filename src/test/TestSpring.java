package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

public class TestSpring {

    @Test
    public void testFn(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User user = (User)applicationContext.getBean("user");
        //User user2 = (User)applicationContext.getBean("user");
        System.out.println(user);


    }
}
