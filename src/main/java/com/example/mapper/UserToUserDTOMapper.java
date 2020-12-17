package com.example.mapper;

import com.example.dto.UserDTO;
import com.example.entity.Order;
import com.example.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserToUserDTOMapper {
    public User toEntity(final UserDTO userDTO, final List<Order> orderList){
        final User user = new User();

        user.setId(userDTO.getId());
        user.setFirstname(userDTO.getFirstname());
        user.setLastname(userDTO.getLastname());
        user.setBirth(userDTO.getBirth());
        user.setOrders(orderList);

        return user;
    }

    public UserDTO toDto(final User user){
        final UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setFirstname(user.getFirstname());
        userDTO.setLastname(user.getLastname());
        userDTO.setBirth(user.getBirth());

        return userDTO;
    }
}
