package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.CustomerService;
import com.etiya.ecommercedemopair2.business.dtos.request.customer.AddCustomerRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.customer.AddCustomerResponse;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerController{
    @Autowired
    private CustomerService customerService;

    @PostMapping("/add")
    public ResponseEntity<AddCustomerResponse> addCustomer(@RequestBody AddCustomerRequest addCustomerRequest){
        return new ResponseEntity<>(customerService.addCustomer(addCustomerRequest), HttpStatus.CREATED);
    }
}
