package com.etiya.ecommercedemopair2.business.concretes;

import com.etiya.ecommercedemopair2.business.abstracts.UserService;
import com.etiya.ecommercedemopair2.entities.concretes.Product;
import com.etiya.ecommercedemopair2.entities.concretes.User;
import com.etiya.ecommercedemopair2.repository.abstracts.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserManager implements UserService {
    private UserRepository userRepository;
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(int id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public List<User> getByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User getByFirstName(String name) {
        return userRepository.findByFirstName(name);
    }

}
