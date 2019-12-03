package com.weichuang.transfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
    //加钱
    public void addMoney(int id , double money){
        //做数据库的加钱操作
        String sql = "update t_user set money = money + ? where id = ?";
        jdbcTemplate.update(sql , money , id);
    }

    //减钱
    public void reduceMoney(int id , double money){
        //做数据库的减钱操作
        String sql = "update t_user set money = money - ? where id = ?";
        jdbcTemplate.update(sql , money , id);
    }
}
