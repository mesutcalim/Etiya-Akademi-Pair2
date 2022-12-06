package com.etiya.ecommercedemopair2.business.dtos.request.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AddAddressRequest {
    private String title;
    private int country_id;
}
