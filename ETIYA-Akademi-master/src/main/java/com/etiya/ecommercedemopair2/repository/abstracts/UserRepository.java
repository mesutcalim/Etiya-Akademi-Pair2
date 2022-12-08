package com.etiya.ecommercedemopair2.repository.abstracts;

import com.etiya.ecommercedemopair2.entities.concretes.Product;
import com.etiya.ecommercedemopair2.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findByEmail(String email);

     // JPQL
    @Query("Select u from User u WHERE u.first_name=:name")
    User findByFirstName(String name);

    @Query("Select u from User as u WHERE u.first_name=:first_name")
    User findByUserName(String first_name);
}
