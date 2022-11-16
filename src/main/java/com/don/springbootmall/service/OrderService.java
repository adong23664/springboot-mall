package com.don.springbootmall.service;

import com.don.springbootmall.dto.CreateOrderRequest;
import com.don.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer orderId, CreateOrderRequest createOrderRequest);

}
