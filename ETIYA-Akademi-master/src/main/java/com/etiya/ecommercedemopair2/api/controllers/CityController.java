package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.CityService;
import com.etiya.ecommercedemopair2.business.constants.Paths;
import com.etiya.ecommercedemopair2.business.dtos.request.city.AddCityRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.city.AddCityResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.core.util.results.SuccessDataResult;
import com.etiya.ecommercedemopair2.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix+"cities")
public class CityController {
    private CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    /*@PostMapping("/add")
    public ResponseEntity<AddCityResponse> addCity(@RequestBody @Valid AddCityRequest addCityRequest){
        return  new ResponseEntity<AddCityResponse>(cityService.addCity(addCityRequest), HttpStatus.CREATED);
    }*/
    @PostMapping("/add")
    public DataResult<AddCityResponse> addCity(@RequestBody @Valid AddCityRequest addCityRequest){
        return new DataResult<AddCityResponse>(cityService.addCity(addCityRequest).getData(),true,"Başarılı");
    }
    @GetMapping("/getById")
    public DataResult<City> getById(@RequestParam("id") int id){
        return cityService.getById(id);
    }

    @GetMapping("/getAllCity")
    public DataResult<List<AddCityResponse>> getAllCity(){
        return new SuccessDataResult<List<AddCityResponse>>(cityService.getAllCity().getData());


    }
}
