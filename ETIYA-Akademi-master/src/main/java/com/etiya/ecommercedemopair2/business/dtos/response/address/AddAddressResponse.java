package com.etiya.ecommercedemopair2.business.dtos.response.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddAddressResponse {
    private int id;
    private String title;
    private int district_id;
}
