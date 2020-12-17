package com.example.service.impl;

import com.example.dto.OrderDTO;
import com.example.service.CartService;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Override
    public OrderDTO getCartByUserId(final Long userId) {
        return null;
    }

    @Override
    public OrderDTO addBookToCart(final Long userId, final Long bookId) {
        return null;
    }
}
