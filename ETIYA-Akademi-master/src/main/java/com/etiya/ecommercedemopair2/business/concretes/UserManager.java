package com.etiya.ecommercedemopair2.business.concretes;

import com.etiya.ecommercedemopair2.business.abstracts.AddressService;
import com.etiya.ecommercedemopair2.business.abstracts.UserService;
import com.etiya.ecommercedemopair2.business.dtos.request.user.AddUserRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.user.AddUserResponse;
import com.etiya.ecommercedemopair2.core.util.mapping.ModelMapperService;
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
    private AddressService addressService;
    private ModelMapperService modelMapperService;

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

    @Override
    public AddUserResponse addUser(AddUserRequest addUserRequest) {
        User user = modelMapperService.getMapper().map(addUserRequest,User.class);

        User savedUser= userRepository.save(user);

        AddUserResponse response=modelMapperService.getMapper().map(savedUser,AddUserResponse.class);

        return response;
    }
}
