package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.DistrictService;
import com.etiya.ecommercedemopair2.business.constants.Paths;
import com.etiya.ecommercedemopair2.business.dtos.request.district.AddDistrictRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.district.AddDistrictResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.entities.concretes.District;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(Paths.apiPrefix+"districts")
@AllArgsConstructor
public class DistrictController {
    @Autowired
    private DistrictService districtService;
//    @PostMapping("/add")
//    public ResponseEntity<AddDistrictResponse> addDistrict(@RequestBody @Valid AddDistrictRequest addDistrictRequest){
//        return new ResponseEntity<AddDistrictResponse>(districtService.addDistrict(addDistrictRequest), HttpStatus.CREATED);
//    }
    @PostMapping("/add")
    public DataResult<AddDistrictResponse> addDistrict(@RequestBody @Valid AddDistrictRequest addDistrictRequest){
        return new DataResult<AddDistrictResponse>(districtService.addDistrict(addDistrictRequest).getData(),true,"Başarılı");
    }

    @GetMapping("/getById")
    public DataResult<District> getById(@RequestParam("id") int id){
        return districtService.getById(id);
    }
}
