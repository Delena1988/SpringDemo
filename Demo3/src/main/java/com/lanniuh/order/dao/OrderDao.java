package com.lanniuh.order.dao;

import com.github.pagehelper.Page;
import com.lanniuh.order.entity.Order;

import java.util.List;

/**
 * Created by linjian on 16/7/30.
 */
public interface OrderDao {
    int getOrderCount();
    List<Order> getOrders();
    Order getOrderById(int id);
    Page<Order> getOrderPaged();
}
