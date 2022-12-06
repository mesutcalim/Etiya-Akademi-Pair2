package com.etiya.ecommercedemopair2.business.concretes;

import com.etiya.ecommercedemopair2.business.abstracts.ShipperService;
import com.etiya.ecommercedemopair2.entities.concretes.Shipper;
import com.etiya.ecommercedemopair2.repository.abstracts.ShipperRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ShipperManager implements ShipperService {
    private ShipperRepository shipperRepository;
    @Override
    public Shipper getById(int id) {
        return shipperRepository.findById(id).orElseThrow();
    }
}
