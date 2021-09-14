package com.ecommerce.shop.services;

import com.ecommerce.shop.models.Users;

import java.util.List;

public interface UsersService {
    List<Users> getAllUsers();

    Users addUsers(Users users);
}
