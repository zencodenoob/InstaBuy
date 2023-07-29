package com.online.store.service;

import com.online.store.entity.Order;
import com.online.store.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    private final OrderRepository orderRepository;

    public OrdersService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void placeOrders(Iterable<Order> orders) {
        orderRepository.saveAll(orders);
    }

}
