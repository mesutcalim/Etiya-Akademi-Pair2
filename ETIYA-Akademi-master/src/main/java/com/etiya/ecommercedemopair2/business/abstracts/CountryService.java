package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.business.dtos.request.country.AddCountryRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.country.AddCountryResponse;

public interface CountryService {
    AddCountryResponse addCountry(AddCountryRequest addCountryRequest);
}
