package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.business.dtos.request.shipper.AddShipperRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.shipper.AddShipperResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.entities.concretes.Shipper;

import java.util.List;

public interface ShipperService {
    DataResult<AddShipperResponse> addShipper (AddShipperRequest addShipperRequest);

    DataResult<List<Shipper>> getAll();

    DataResult<Shipper> getById(int id);
}
