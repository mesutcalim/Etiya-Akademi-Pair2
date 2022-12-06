package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.entities.concretes.PaymentMethod;

public interface PaymentMethodService {
    PaymentMethod getById(int id);
}
