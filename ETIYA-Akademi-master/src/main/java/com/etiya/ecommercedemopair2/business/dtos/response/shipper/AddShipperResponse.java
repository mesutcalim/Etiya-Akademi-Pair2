package com.etiya.ecommercedemopair2.business.dtos.response.shipper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddShipperResponse {
    private int id;
    private String company_name;
    private String phone_number;
    private int role_id;
}
