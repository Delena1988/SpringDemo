package com.laniuh.service.impl;

import com.laniuh.entity.Person;
import com.laniuh.service.HelloApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by linjian on 16/7/29.
 */
@Service("hello")
public class HelloImp implements HelloApi {
    @Autowired
    private Person person;

    @Override
    public void sayHello() {
        System.out.println("Hello " + person.getName() +" Annotation!");
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
