package com.example.service.impl;

import com.example.dto.OrderDTO;
import com.example.entity.Book;
import com.example.entity.Order;
import com.example.mapper.OrderToOrderDTOMapper;
import com.example.repository.BookRepository;
import com.example.repository.OrderRepository;
import com.example.repository.UserRepository;
import com.example.service.CartService;
import com.thoughtworks.qdox.model.expression.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private OrderToOrderDTOMapper orderMapper;

    @Override
    public OrderDTO getCartByUserId(final Long userId) {
        return null;
    }

    @Override
    public OrderDTO addBookToCart(final Long userId, final Long bookId) {
        final List<Order> orders = orderRepository.getOrdersByUserId(userId);

        Order order = orders.stream()
                .filter(e -> !e.wasPaid())
                .findFirst()
                .orElse(null);

        if(order == null){
            //тут ми створюємо нове замовлення
            order = new Order();

            order.setOrderDate(LocalDate.now());
            order.setUser(userRepository.getUserById(userId));

        }

        final Book book = bookRepository.getBookById(bookId);

        if(order.getOrderDetails().containsKey(book)){
            int value = order.getOrderDetails().get(book);
            order.getOrderDetails().put(book, ++value);
        } else {
            order.getOrderDetails().put(book, 1); //we use 1 because it is first book
        }

        orderRepository.createOrder(order);


        return orderMapper.toDTO(order);
    }

    @Override
    public OrderDTO removeBookFromCart(final Long userId, final Long bookId) {
        return null;
    }
}
