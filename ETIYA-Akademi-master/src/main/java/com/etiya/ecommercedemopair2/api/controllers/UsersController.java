package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.UserService;
import com.etiya.ecommercedemopair2.business.dtos.request.user.AddUserRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.user.AddUserResponse;
import com.etiya.ecommercedemopair2.entities.concretes.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UsersController {
    @Autowired
    private UserService userService;
    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/findByEmail")
    public List<User> getByEmail(@RequestParam("email") String email){
        return userService.getByEmail(email);
    }

    @GetMapping("getByFirstName")
    public User getByFirstName(@RequestParam("name") String name){
        return userService.getByFirstName(name);
    }

    @PostMapping("/add")
    public ResponseEntity<AddUserResponse> addUser(@RequestBody AddUserRequest addUserRequest){
        return new ResponseEntity<AddUserResponse>(userService.addUser(addUserRequest), HttpStatus.CREATED);
    }
}
