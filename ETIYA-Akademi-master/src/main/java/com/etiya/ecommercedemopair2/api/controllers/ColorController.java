package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.ColorService;
import com.etiya.ecommercedemopair2.business.dtos.request.color.AddColorRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.color.AddColorResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/colors")
@AllArgsConstructor
public class ColorController {
    private ColorService colorService;

    @PostMapping("/add")
    public ResponseEntity<AddColorResponse> addColor(@RequestBody AddColorRequest addColorRequest){
        return new ResponseEntity<AddColorResponse>(colorService.addColor(addColorRequest), HttpStatus.CREATED);
    }
}