package com.lanniuh.webservice.impl;

import com.lanniuh.webservice.MyWebservice;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by linjian
 * 16/9/26.
 */
@WebService(name = "MyTestWS",serviceName = "MyWebservice",targetNamespace = "http://localhost/clident")
public class MyWebserviceImpl implements MyWebservice {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/MyWebservice",new MyWebserviceImpl());
    }
}
