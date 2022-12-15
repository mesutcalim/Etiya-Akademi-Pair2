package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.OrderDetailsService;
import com.etiya.ecommercedemopair2.business.constants.Paths;
import com.etiya.ecommercedemopair2.business.dtos.request.orderDetails.AddOrderDetailsRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.orderDetails.AddOrderDetailsResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(Paths.apiPrefix+"orderDetails")
@AllArgsConstructor
public class OrderDetailsController {
    @Autowired
    private OrderDetailsService orderDetailsService;

    /*@PostMapping("/add")
    public ResponseEntity<AddOrderDetailsResponse> addOrderDetail(@RequestBody @Valid AddOrderDetailsRequest addOrderDetailsRequest){
        return new ResponseEntity<>(orderDetailsService.addOrderDetails(addOrderDetailsRequest), HttpStatus.CREATED);
    }*/
    @PostMapping("/add")
    public DataResult<AddOrderDetailsResponse> addOrderDetail(@RequestBody @Valid AddOrderDetailsRequest addOrderDetailsRequest){
        return new DataResult<AddOrderDetailsResponse>(orderDetailsService.addOrderDetails(addOrderDetailsRequest).getData(),true,"Başarılı");
    }

    @PostMapping("/addTrans")
    public DataResult<AddOrderDetailsResponse> addOrderDetailWithTransaction(@RequestBody @Valid AddOrderDetailsRequest addOrderDetailsRequest){
        return new DataResult<AddOrderDetailsResponse>(orderDetailsService.addOrderDetailsWithTransaction(addOrderDetailsRequest).getData(),true,"Başarılı");
    }

}
