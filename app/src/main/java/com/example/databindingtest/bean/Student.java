package com.example.databindingtest.bean;

public class Student {

    private String name;
    private String addr;

    public Student() {
    }

    public Student(String name,String addr) {
        this.addr = addr;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
}