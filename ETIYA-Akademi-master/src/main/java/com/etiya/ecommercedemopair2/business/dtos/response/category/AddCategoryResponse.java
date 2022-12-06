package com.etiya.ecommercedemopair2.business.dtos.response.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCategoryResponse {
    private int id;
    private String name;
}
