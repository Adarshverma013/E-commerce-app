package com.ecommerce.shop.controllers;

import com.ecommerce.shop.models.Users;
import com.ecommerce.shop.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/all")
    List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }
}
