package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.RoleService;
import com.etiya.ecommercedemopair2.business.constants.Paths;
import com.etiya.ecommercedemopair2.business.dtos.request.role.AddRoleRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.role.AddRoleResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.entities.concretes.Role;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(Paths.apiPrefix+"roles")
@AllArgsConstructor
public class RoleController {
    @Autowired
    private RoleService roleService;
//    @PostMapping("/add")
//    public ResponseEntity<AddRoleResponse> addRole (@RequestBody @Valid AddRoleRequest addRoleRequest){
//        return new ResponseEntity<AddRoleResponse>(roleService.addRole(addRoleRequest), HttpStatus.CREATED);
//    }
    @PostMapping("/add")
    public DataResult<AddRoleResponse> addRole (@RequestBody @Valid AddRoleRequest addRoleRequest){
        return new DataResult<AddRoleResponse>(roleService.addRole(addRoleRequest).getData(),true,"Başarılı");
    }
    @GetMapping("/getById")
    public DataResult<Role> getByIdPath(@RequestParam("id") int id){
        return roleService.getById(id);
    }

}
