package com.example.dto;

import com.example.entity.Book;
import com.example.entity.User;

import java.time.LocalDate;
import java.util.Map;

public class OrderDTO {
    private LocalDate orderDate;
    private String userFirstname;
    private String userLastname;
    private Map<Book, Integer> orderDetails;

    public OrderDTO() {
    }

    public OrderDTO(final LocalDate orderDate, final String userFirstname, final String userLastname, final Map<Book, Integer> orderDetails) {
        this.orderDate = orderDate;
        this.userFirstname = userFirstname;
        this.userLastname = userLastname;
        this.orderDetails = orderDetails;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(final LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public void setUserFirstname(final String userFirstname) {
        this.userFirstname = userFirstname;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(final String userLastname) {
        this.userLastname = userLastname;
    }

    public Map<Book, Integer> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(final Map<Book, Integer> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
