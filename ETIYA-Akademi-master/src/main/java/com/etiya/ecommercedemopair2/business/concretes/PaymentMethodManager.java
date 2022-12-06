package com.etiya.ecommercedemopair2.business.concretes;

import com.etiya.ecommercedemopair2.business.abstracts.PaymentMethodService;
import com.etiya.ecommercedemopair2.entities.concretes.PaymentMethod;
import com.etiya.ecommercedemopair2.repository.abstracts.PaymentMethodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentMethodManager implements PaymentMethodService {
    private PaymentMethodRepository paymentMethodRepository;
    @Override
    public PaymentMethod getById(int id) {
        return paymentMethodRepository.findById(id).orElseThrow();
    }
}
