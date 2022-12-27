package com.Icy.pojo;

public class Hello {
    //编写实体类
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("hello"+name);
    }
}
