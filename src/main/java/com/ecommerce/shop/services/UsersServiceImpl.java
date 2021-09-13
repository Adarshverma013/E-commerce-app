package com.ecommerce.shop.services;

import com.ecommerce.shop.models.Users;
import com.ecommerce.shop.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<Users> getAllUsers(){
        return usersRepository.findAll();
    }

}
