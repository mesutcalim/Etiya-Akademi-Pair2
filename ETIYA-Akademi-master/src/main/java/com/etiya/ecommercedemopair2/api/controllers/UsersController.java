package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.UserService;
import com.etiya.ecommercedemopair2.business.constants.Paths;
import com.etiya.ecommercedemopair2.business.dtos.request.user.AddUserRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.user.AddUserResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemopair2.entities.concretes.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix+"users")
@AllArgsConstructor
public class UsersController {
    @Autowired
    private UserService userService;
    @GetMapping("/getAll")
    public DataResult<List<User>> getAll(){
        return userService.getAll();
    }

    @GetMapping("/findByEmail")
    public DataResult<List<User>> getByEmail(@RequestParam("email") String email){
        return new SuccessDataResult<>(userService.getByEmail(email));
    }

    //HATALI ÇALIŞIYOR
    /*@GetMapping("getByFirstName")
    public User getByFirstName(@RequestParam("name") String name){
        return userService.getByFirstName(name);
    }
*/
//    @PostMapping("/add")
//    public ResponseEntity<AddUserResponse> addUser(@RequestBody @Valid AddUserRequest addUserRequest){
//        return new ResponseEntity<AddUserResponse>(userService.addUser(addUserRequest), HttpStatus.CREATED);
//    }
    @PostMapping("/add")
    public DataResult<AddUserResponse> addUser(@RequestBody @Valid AddUserRequest addUserRequest) {
        return new DataResult<AddUserResponse>(userService.addUser(addUserRequest).getData(),true,"Başarılı");
    }
}
