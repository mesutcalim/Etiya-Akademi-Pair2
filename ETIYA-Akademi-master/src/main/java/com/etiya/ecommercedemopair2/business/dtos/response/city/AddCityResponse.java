package com.etiya.ecommercedemopair2.business.dtos.response.city;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCityResponse {
    private int id;
    private String city_name;
    private int district_id;
}
