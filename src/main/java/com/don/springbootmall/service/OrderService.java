package com.don.springbootmall.service;

import com.don.springbootmall.dto.CreateOrderRequest;
import com.don.springbootmall.dto.OrderQueryParams;
import com.don.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer orderId, CreateOrderRequest createOrderRequest);

}
