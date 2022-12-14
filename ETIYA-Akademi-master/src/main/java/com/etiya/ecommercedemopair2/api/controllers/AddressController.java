package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.AddressService;
import com.etiya.ecommercedemopair2.business.constants.Paths;
import com.etiya.ecommercedemopair2.business.dtos.request.address.AddAddressRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.address.AddAddressResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.core.util.results.SuccessDataResult;
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
@RequestMapping(Paths.apiPrefix+"address")
@AllArgsConstructor
public class AddressController {
    @Autowired
    private AddressService addressService;

//    @PostMapping("/add")
//    public ResponseEntity<AddAddressResponse> addAddress(@RequestBody @Valid AddAddressRequest addAddressRequest){
//        return new ResponseEntity<>(addressService.addAddress(addAddressRequest), HttpStatus.CREATED);
//    }
    @PostMapping("/addResult")
    public DataResult<AddAddressResponse> addAdressResult (@RequestBody @Valid AddAddressRequest addAddressRequest){
        return new SuccessDataResult<>(addressService.addAddress(addAddressRequest).getData(),"Başarılı");
    }
}


