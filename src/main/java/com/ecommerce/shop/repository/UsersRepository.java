package com.ecommerce.shop.repository;

import com.ecommerce.shop.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


public interface UsersRepository extends JpaRepository<Users,Long> {

}
