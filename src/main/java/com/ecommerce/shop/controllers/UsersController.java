package com.ecommerce.shop.controllers;

import com.ecommerce.shop.models.Users;
import com.ecommerce.shop.services.UsersService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    Users addUsers(@Validated @NotNull @RequestBody Users users)
    {
        return usersService.addUsers(users);
    }
}
