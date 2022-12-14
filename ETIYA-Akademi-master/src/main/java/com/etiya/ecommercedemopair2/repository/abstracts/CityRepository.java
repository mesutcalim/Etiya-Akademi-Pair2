package com.etiya.ecommercedemopair2.repository.abstracts;

import com.etiya.ecommercedemopair2.business.dtos.response.city.AddCityResponse;
import com.etiya.ecommercedemopair2.entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Integer> {
    @Query("select new com.etiya.ecommercedemopair2.business.dtos.response.city.AddCityResponse" +
            "(c.id,c.city_name,co.id) from City c inner join c.country co")
    List<AddCityResponse> getAllCity();
}
