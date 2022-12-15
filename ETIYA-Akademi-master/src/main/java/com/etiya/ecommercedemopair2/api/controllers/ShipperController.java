package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.ShipperService;
import com.etiya.ecommercedemopair2.business.constants.Paths;
import com.etiya.ecommercedemopair2.business.dtos.request.shipper.AddShipperRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.shipper.AddShipperResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.entities.concretes.Shipper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(Paths.apiPrefix+"shippers")
@AllArgsConstructor
public class ShipperController {
    @Autowired
    private ShipperService shipperService;

    @GetMapping("/getAll")
    public DataResult<List<Shipper>> getAll(){
        return shipperService.getAll();
    }

    @GetMapping("/getbyId")
    public DataResult<Shipper> getByIdPath(@RequestParam ("id") int id){
        return shipperService.getById(id);
    }

//    @PostMapping("/add")
//    public ResponseEntity<AddShipperResponse> addShipper(@RequestBody @Valid AddShipperRequest addShipperRequest){
//        return new ResponseEntity<AddShipperResponse>(shipperService.addShipper(addShipperRequest), HttpStatus.CREATED);
//    }
    @PostMapping("/add")
    public DataResult<AddShipperResponse> addShipper(@RequestBody @Valid AddShipperRequest addShipperRequest){
        return new DataResult<AddShipperResponse>(shipperService.addShipper(addShipperRequest).getData(),true,"Başarılı");
    }

}
