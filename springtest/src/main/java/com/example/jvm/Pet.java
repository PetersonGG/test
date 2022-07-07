package com.example.jvm;

/**
 * @Author: Reznov
 * @Description:
 * @Date: 2022/7/4
 */
public class Pet {

    private int age;
    private String name;

    public void shut(){
        System.out.println("叫了一声");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
