package com.lanniuh.dubbo.registry.service.impl;

import com.lanniuh.dubbo.registry.service.TestRegistryService;
import org.springframework.stereotype.Service;

/**
 * Created by linjian on 16/8/1.
 */
public class TestRegistryServiceImpl implements TestRegistryService {
    @Override
    public String sayHello(String name) {
        return "hello:" + name;
    }
}
