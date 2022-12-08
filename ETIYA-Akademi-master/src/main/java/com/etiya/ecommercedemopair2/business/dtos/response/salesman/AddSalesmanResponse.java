package com.etiya.ecommercedemopair2.business.dtos.response.salesman;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddSalesmanResponse {
    private int id;
    private String company_name;
    private int role_id;
    private int user_id;
}
