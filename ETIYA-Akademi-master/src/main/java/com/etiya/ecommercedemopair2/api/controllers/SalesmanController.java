package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.SalesmanService;
import com.etiya.ecommercedemopair2.business.dtos.request.salesman.AddSalesmanRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.salesman.AddSalesmanResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/salesmans")
@AllArgsConstructor
public class SalesmanController {
    @Autowired
    private SalesmanService salesmanService;

    @PostMapping("/add")
    public ResponseEntity<AddSalesmanResponse> addSalesman(@RequestBody AddSalesmanRequest addSalesmanRequest){
        return new ResponseEntity<AddSalesmanResponse>(salesmanService.addSalesman(addSalesmanRequest), HttpStatus.CREATED);
    }
}
