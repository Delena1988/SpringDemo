package com.lanniuh.person.entity;

import org.springframework.stereotype.Component;

/**
 * Created by linjian
 * 16/8/11.
 */
@Component
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
