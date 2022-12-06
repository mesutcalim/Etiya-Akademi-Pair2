package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.UserService;
import com.etiya.ecommercedemopair2.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    @Autowired
    private UserService userService;

//    public UsersController(UserService userService){
//        this.userService = userService;
//    }

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
}
