package com.weichuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Component
@Service   //业务层service层
@Repository  //dao类放入Spring容器中
@Controller //SpringMvc框架表示uri接口接收类
public class User implements Serializable{

    private String name;
    private int age;
    private Car car;
    private List<String> scores = new ArrayList<>();

    public User(){
        System.out.println("构造方法");
    }

    public User(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }
    @Value("zhangsan")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<String> getScores() {
        return scores;
    }

    public void setScores(List<String> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", scores=" + scores +
                '}';
    }
}
