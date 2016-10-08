package com.lanniuh;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lanniuh.order.entity.Order;
import com.lanniuh.order.service.OrderService;
import com.lanniuh.person.entity.Person;
import com.lanniuh.person.service.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by linjian on 16/7/30.
 */
public class SpringMybatisTest {
    ApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test() {
        OrderService service = context.getBean("orderService", OrderService.class);
        System.out.println(service.getOrderCount());
    }

    @Test
    public void test2() {
        OrderService service = context.getBean("orderService", OrderService.class);
        List<Order> orderList = service.getOrders();
        for (Order order : orderList) {
            System.out.println(order.toString());
        }
    }

    @Test
    public void test3(){
        OrderService service = context.getBean("orderService",OrderService.class);
        Order order = service.getOrderById(1);
        System.out.println(order.toString());
    }

    @Test
    public void test4(){
        OrderService service = context.getBean("orderService",OrderService.class);
        PageHelper.startPage(1,1);
        Page<Order> page = service.getOrderPaged();
        System.out.println(JSON.toJSONString(page.toPageInfo()));

        PersonService personService = context.getBean("personService",PersonService.class);
        Page<Person> personPage = personService.getPersonPaged();
        System.out.println(JSON.toJSONString(personPage.toPageInfo()));
    }

}
