package com.lanniuh.order.service.impl;

import com.github.pagehelper.Page;
import com.lanniuh.order.dao.OrderDao;
import com.lanniuh.order.entity.Order;
import com.lanniuh.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian on 16/7/30.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public Order getOrderById(int id) {
        return orderDao.getOrderById(id);
    }

    @Override
    public Page<Order> getOrderPaged() {
        return  orderDao.getOrderPaged();
    }

    @Override
    public List<Order> getOrders() {
        return orderDao.getOrders();
    }

    @Override
    public int getOrderCount() {
        return orderDao.getOrderCount();
    }
}
