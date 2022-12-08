package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.business.dtos.request.country.AddCountryRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.country.AddCountryResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Country;

public interface CountryService {
    AddCountryResponse addCountry(AddCountryRequest addCountryRequest);

    Country getById(int id);
}
