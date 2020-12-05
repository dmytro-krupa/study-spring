package com.example.repository;

import com.example.entity.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public class UserRepository {
    public User getDummyUser(){
        //todo add some user repository and replace dummy user
        return new User("dummy", "user", LocalDate.now(), null);
    }
}
