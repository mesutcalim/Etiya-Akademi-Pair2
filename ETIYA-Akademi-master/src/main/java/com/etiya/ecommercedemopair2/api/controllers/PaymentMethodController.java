package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.PaymentMethodService;
import com.etiya.ecommercedemopair2.business.constants.Paths;
import com.etiya.ecommercedemopair2.business.dtos.request.paymentMethod.AddPaymentMethodRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.paymentMethod.AddPaymentMethodResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.entities.concretes.PaymentMethod;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix+"paymentMethods")
@AllArgsConstructor
public class PaymentMethodController {
    @Autowired
    private PaymentMethodService paymentMethodService;

    @GetMapping("/getAll")
    public DataResult<List<PaymentMethod>> getAll(){
        return paymentMethodService.getAll();
    }

//    @PostMapping("/add")
//    public ResponseEntity<AddPaymentMethodResponse> addPaymentMethod(@RequestBody @Valid AddPaymentMethodRequest addPaymentMethodRequest){
//        return new ResponseEntity<>(paymentMethodService.addPaymentMethod(addPaymentMethodRequest), HttpStatus.CREATED);
//    }
    @PostMapping("/add")
    public DataResult<AddPaymentMethodResponse> addPaymentMethod(@RequestBody @Valid AddPaymentMethodRequest addPaymentMethodRequest){
        return new DataResult<AddPaymentMethodResponse>(paymentMethodService.addPaymentMethod(addPaymentMethodRequest).getData(),true,"Başarılı");
    }

    @GetMapping("/getById")
    public DataResult<PaymentMethod> getByIdPath(@RequestParam("id") int id){
        return paymentMethodService.getById(id);
    }
}
