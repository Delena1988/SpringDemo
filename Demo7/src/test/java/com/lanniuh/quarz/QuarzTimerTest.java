package com.lanniuh.quarz;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by linjian
 * 16/8/13.
 */
public class QuarzTimerTest {
    private ApplicationContext context;
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(1000*1000*1000);
    }
}
