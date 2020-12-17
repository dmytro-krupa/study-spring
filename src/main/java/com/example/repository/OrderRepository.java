package com.example.repository;

import com.example.entity.Order;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;

@Repository
public class OrderRepository {

    @PostConstruct
    public void init(){
        dummyOrder = new Order();
    }

    private Order dummyOrder;


    public List<Order> getOrdersByUserId(final Long userId){
        return null;
    }

}
