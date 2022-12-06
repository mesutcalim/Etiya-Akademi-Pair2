package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.business.dtos.request.customer.AddCustomerRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.customer.AddCustomerResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Customer;
import org.springframework.jdbc.support.CustomSQLExceptionTranslatorRegistry;

public interface CustomerService {

    AddCustomerResponse addCustomer(AddCustomerRequest addCustomerRequest);
    Customer getById(int id);
}
