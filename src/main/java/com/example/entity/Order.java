package com.example.entity;

import java.time.LocalDate;
import java.util.Map;

public class Order {
    private Long id;
    private LocalDate orderDate;
    private User user;
    private Map<Book, Integer> orderDetails;

    public Order() {
    }

    public Order(final Long id, final LocalDate orderDate, final User user, final Map<Book, Integer> orderDetails) {
        this.id = id;
        this.orderDate = orderDate;
        this.user = user;
        this.orderDetails = orderDetails;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(final LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(final User user) {
        this.user = user;
    }

    public Map<Book, Integer> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(final Map<Book, Integer> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }
}
