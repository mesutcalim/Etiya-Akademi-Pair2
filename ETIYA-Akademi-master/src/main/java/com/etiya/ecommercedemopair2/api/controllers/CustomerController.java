package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.CustomerService;
import com.etiya.ecommercedemopair2.business.constants.Paths;
import com.etiya.ecommercedemopair2.business.dtos.request.customer.AddCustomerRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.customer.AddCustomerResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemopair2.entities.concretes.Customer;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(Paths.apiPrefix+"customers")
@AllArgsConstructor
public class CustomerController{
    @Autowired
    private CustomerService customerService;

//    @PostMapping("/add")
//    public ResponseEntity<AddCustomerResponse> addCustomer(@RequestBody @Valid AddCustomerRequest addCustomerRequest){
//        return new ResponseEntity<>(customerService.addCustomer(addCustomerRequest), HttpStatus.CREATED);
//    }
    @PostMapping("/add")
    public DataResult<AddCustomerResponse> addCustomer(@RequestBody @Valid AddCustomerRequest addCustomerRequest){
        return new SuccessDataResult<>(customerService.addCustomer(addCustomerRequest).getData(),"Başarılı");
    }

    @GetMapping("/getById")
    public DataResult<Customer> getById(@RequestParam("id") int id){
        return customerService.getById(id);
    }
}
