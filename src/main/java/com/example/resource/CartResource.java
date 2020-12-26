package com.example.resource;

import com.example.dto.OrderDTO;
import com.example.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartResource {

    @Autowired
    public CartService cartService;

    @GetMapping("/cart/{id}")
    public OrderDTO getCartByUserId(final @PathVariable Long userId){
        return cartService.getCartByUserId(userId);
    }

    @PostMapping("/cart/{id}/{bookId}")
    public OrderDTO addBookToCart(final @PathVariable Long id,
                                    final @PathVariable Long bookId){
        return cartService.addBookToCart(id, bookId);
    }


    @DeleteMapping("/cart/{id}/{bookId}")
    public OrderDTO removeBookFromCart(final @PathVariable Long userId,
                                  final @PathVariable Long bookId){
        return cartService.removeBookFromCart(userId, bookId);
    }
}
