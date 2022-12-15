package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.business.dtos.request.paymentMethod.AddPaymentMethodRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.paymentMethod.AddPaymentMethodResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.entities.concretes.PaymentMethod;

import java.util.List;

public interface PaymentMethodService {
    DataResult<List<PaymentMethod>> getAll();

    DataResult<PaymentMethod> getById(int id);

    DataResult<AddPaymentMethodResponse> addPaymentMethod(AddPaymentMethodRequest addPaymentMethodRequest);
}
