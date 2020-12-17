package com.example.service;

import com.example.dto.OrderDTO;

public interface CartService {

    OrderDTO getCartByUserId(Long userId);
    OrderDTO addBookToCart(Long userId, Long bookId);

}
