package com.etiya.ecommercedemopair2.business.dtos.request.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AddCustomerRequest {
    private int payment_id;
    private int role_id;
    private int user_id;
}
