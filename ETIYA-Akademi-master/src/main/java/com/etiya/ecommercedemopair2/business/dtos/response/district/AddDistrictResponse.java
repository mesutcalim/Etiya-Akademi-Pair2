package com.etiya.ecommercedemopair2.business.dtos.response.district;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddDistrictResponse {
    private int id;
    private String district_name;
}
