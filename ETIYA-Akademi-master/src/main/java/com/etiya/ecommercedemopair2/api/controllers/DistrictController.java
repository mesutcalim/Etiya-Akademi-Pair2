package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.DistrictService;
import com.etiya.ecommercedemopair2.business.dtos.request.district.AddDistrictRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.district.AddDistrictResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/districts")
@AllArgsConstructor
public class DistrictController {
    @Autowired
    private DistrictService districtService;
    @PostMapping("/add")
    public ResponseEntity<AddDistrictResponse> addDistrict(@RequestBody AddDistrictRequest addDistrictRequest){
        return new ResponseEntity<AddDistrictResponse>(districtService.addDistrict(addDistrictRequest), HttpStatus.CREATED);
    }
}
