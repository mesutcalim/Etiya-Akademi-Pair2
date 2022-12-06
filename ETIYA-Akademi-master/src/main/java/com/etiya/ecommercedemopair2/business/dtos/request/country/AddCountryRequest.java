package com.etiya.ecommercedemopair2.business.dtos.request.country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AddCountryRequest {
    private String country_name;
    private int city_id;
}
