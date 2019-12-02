package com.weichuang.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.weichuang.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTest {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    public void testFn1(){
        String sql = "insert into t_student (sno , sname) values(? , ?)";
        jdbcTemplate.update(sql , 20171123 , "zhaoliu");
    }

    @Test
    public void testFn() throws PropertyVetoException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/linda_shiyan_web");
        comboPooledDataSource.setPassword("root");
        comboPooledDataSource.setUser("root");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(comboPooledDataSource);
        String sql = "select * from t_student";
        List<Student> studentList = jdbcTemplate.query(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student student = new Student();
                student.setSno(rs.getInt("sno"));
                student.setSname(rs.getString("sname"));
                return student;
            }
        });
        for(Student s : studentList){
            System.out.println(s);
        }
    }
}
