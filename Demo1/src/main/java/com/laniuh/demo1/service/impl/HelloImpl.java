package com.laniuh.demo1.service.impl;

import com.laniuh.demo1.service.HelloApi;

/**
 * Created by linjian on 16/7/29.
 */
public class HelloImpl implements HelloApi {
    @Override
    public void sayHello() {
        System.out.println("Hello Spring!");
    }
}
