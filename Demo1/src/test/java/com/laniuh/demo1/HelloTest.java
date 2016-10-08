package com.laniuh.demo1;

import com.laniuh.demo1.service.HelloApi;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linjian on 16/7/29.
 */
public class HelloTest {
    ClassPathXmlApplicationContext context = null;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("hellospring.xml");
    }

    @Test
    public void test1() {
        HelloApi hello = context.getBean("hello",HelloApi.class);
        hello.sayHello();
    }
}
