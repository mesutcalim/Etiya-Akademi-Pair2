package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.CountryService;
import com.etiya.ecommercedemopair2.business.constants.Paths;
import com.etiya.ecommercedemopair2.business.dtos.request.country.AddCountryRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.country.AddCountryResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.entities.concretes.Country;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(Paths.apiPrefix+"countries")
@AllArgsConstructor
public class CountryController {
    @Autowired
    private CountryService countryService;

   /* @PostMapping("/add")
    public ResponseEntity<AddCountryResponse> addCountry(@RequestBody @Valid AddCountryRequest addCountryRequest){
        return new ResponseEntity<AddCountryResponse>(countryService.addCountry(addCountryRequest), HttpStatus.CREATED);
    }*/
    @PostMapping("/add")
    public DataResult<AddCountryResponse> addCountry(@RequestBody @Valid AddCountryRequest addCountryRequest){
        return new DataResult<AddCountryResponse>(countryService.addCountry(addCountryRequest).getData(),true,"Başarılı");
    }
    @GetMapping("/getById")
    public DataResult<Country> getById(@RequestParam("id") int id){
        return countryService.getById(id);
    }
}
