package com.etiya.ecommercedemopair2.business.dtos.request.paymentMethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddPaymentMethodRequest {
    private String name;
}
