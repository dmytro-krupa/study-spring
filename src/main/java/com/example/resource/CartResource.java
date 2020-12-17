package com.example.resource;

import com.example.dto.OrderDTO;
import com.example.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartResource {

    @Autowired
    public CartService cartService;

    @GetMapping("/cart/{id}")
    public OrderDTO getCartByUserId(final @PathVariable Long id){
        return cartService.getCartByUserId(id);
    }

    @PostMapping("/cart/{id}/{bookId}")
    public OrderDTO getCartByUserId(final @PathVariable Long id,
                                    final @PathVariable Long bookId){
        return cartService.addBookToCart(id, bookId);
    }

}
