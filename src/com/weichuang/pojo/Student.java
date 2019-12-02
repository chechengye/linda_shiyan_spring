package com.weichuang.pojo;

import java.io.Serializable;

public class Student implements Serializable{
    private int id;
    private int sno;
    private String sname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sno=" + sno +
                ", sname='" + sname + '\'' +
                '}';
    }
}
