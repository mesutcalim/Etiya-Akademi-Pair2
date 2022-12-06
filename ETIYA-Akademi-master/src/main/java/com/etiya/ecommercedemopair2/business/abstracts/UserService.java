package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.entities.concretes.Product;
import com.etiya.ecommercedemopair2.entities.concretes.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getById(int id);

    List<User> getByEmail(String email);

    User getByFirstName(String name);
}
