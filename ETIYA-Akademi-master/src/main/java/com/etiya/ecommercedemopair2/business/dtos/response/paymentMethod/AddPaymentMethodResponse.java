package com.etiya.ecommercedemopair2.business.dtos.response.paymentMethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddPaymentMethodResponse {
    private int id;
    private String name;
}
