package com.lanniuh;


import com.lanniuh.dubbo.registry.service.TestRegistryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linjian on 16/8/1.
 */
public class Consumer {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestRegistryService service = context.getBean("testRegistryService", TestRegistryService.class);
        System.out.println(service.sayHello("LinJian"));
        Thread.sleep(1000000000);
    }

}
