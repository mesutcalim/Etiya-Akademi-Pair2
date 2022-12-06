package com.etiya.ecommercedemopair2.business.concretes;

import com.etiya.ecommercedemopair2.business.abstracts.CustomerService;
import com.etiya.ecommercedemopair2.business.abstracts.PaymentMethodService;
import com.etiya.ecommercedemopair2.business.abstracts.RoleService;
import com.etiya.ecommercedemopair2.business.abstracts.UserService;
import com.etiya.ecommercedemopair2.business.dtos.request.customer.AddCustomerRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.customer.AddCustomerResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Customer;
import com.etiya.ecommercedemopair2.entities.concretes.PaymentMethod;
import com.etiya.ecommercedemopair2.entities.concretes.Role;
import com.etiya.ecommercedemopair2.entities.concretes.User;
import com.etiya.ecommercedemopair2.repository.abstracts.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerManager implements CustomerService {
    private CustomerRepository customerRepository;
    private UserService userService;
    private RoleService roleService;
    private PaymentMethodService paymentMethodService;
    @Override
    public Customer getById(int id) {
        return customerRepository.findById(id).orElseThrow();
    }

    @Override
    public AddCustomerResponse addCustomer(AddCustomerRequest addCustomerRequest) {
        Customer customer = new Customer();
        User user = userService.getById(addCustomerRequest.getUser_id());
        customer.setUser(user);

        Role role = roleService.getById(addCustomerRequest.getRole_id());
        customer.setRole(role);

        PaymentMethod paymentMethod = paymentMethodService.getById(addCustomerRequest.getPayment_id());
        customer.setPaymentMethod(paymentMethod);

        Customer savedCustomer = customerRepository.save(customer);

        AddCustomerResponse response = new AddCustomerResponse(savedCustomer.getId(), savedCustomer.getPaymentMethod().getId(),savedCustomer.getRole().getId(),savedCustomer.getUser().getId());
        return response;
    }
}
