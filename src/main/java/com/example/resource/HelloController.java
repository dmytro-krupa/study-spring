package com.example.resource;

import com.example.dto.UserDTO;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/dummy")
    public UserDTO dummy() {
        if(true){
            throw new RuntimeException("some text");
        }
        return userService.getDummyUser();
    }

}


