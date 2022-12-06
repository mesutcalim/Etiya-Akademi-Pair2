package com.etiya.ecommercedemopair2.business.dtos.request.city;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AddCityRequest {
    private String city_name;
    private int district_id;
}
