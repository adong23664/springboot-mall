package com.don.springbootmall.service;

import com.don.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer orderId, CreateOrderRequest createOrderRequest);

}
