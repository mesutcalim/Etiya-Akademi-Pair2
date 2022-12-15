package com.etiya.ecommercedemopair2.business.dtos.response.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddProductResponse {
    private int id;
    private String name;
    private double unit_price;
    private int stock;
    private int category_id;
    private int color_id;
    private int sale_count;
}
