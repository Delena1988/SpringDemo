package com.lanniuh.order.service;

import com.github.pagehelper.Page;
import com.lanniuh.order.entity.Order;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by linjian on 16/7/30.
 */
@Transactional(value = "mysql")
public interface OrderService {
    int getOrderCount();
    List<Order> getOrders();
    Order getOrderById(int id);
    Page<Order> getOrderPaged();
}
