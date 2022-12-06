package com.etiya.ecommercedemopair2.repository.abstracts;

import com.etiya.ecommercedemopair2.entities.concretes.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod,Integer> {
}
