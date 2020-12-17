package com.example.service.impl;

import com.example.dto.OrderDTO;
import com.example.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderDTO getOrderById(final Long id) {
        return null;
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return null;
    }

    @Override
    public OrderDTO createOrder(final OrderDTO OrderDTO) {
        return null;
    }

    @Override
    public OrderDTO updateOrder(final OrderDTO OrderDTO) {
        return null;
    }

    @Override
    public void deleteOrderById(final Long id) {

    }
}
