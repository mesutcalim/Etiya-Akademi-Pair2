package com.etiya.ecommercedemopair2.business.dtos.response.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomerResponse {
    private int id;
    private int payment_id;
    private int role_id;
    private int user_id;
}
