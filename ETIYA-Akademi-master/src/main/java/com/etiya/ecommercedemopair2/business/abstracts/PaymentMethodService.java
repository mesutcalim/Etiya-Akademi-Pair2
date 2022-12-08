package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.business.dtos.request.paymentMethod.AddPaymentMethodRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.paymentMethod.AddPaymentMethodResponse;
import com.etiya.ecommercedemopair2.entities.concretes.PaymentMethod;

import java.util.List;

public interface PaymentMethodService {
    List<PaymentMethod> getAll();
    PaymentMethod getById(int id);

    AddPaymentMethodResponse addPaymentMethod(AddPaymentMethodRequest addPaymentMethodRequest);
}
