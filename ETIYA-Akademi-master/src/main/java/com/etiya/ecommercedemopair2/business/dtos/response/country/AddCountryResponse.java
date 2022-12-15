package com.etiya.ecommercedemopair2.business.dtos.response.country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCountryResponse {
    private int id;
    private String country_name;
}
