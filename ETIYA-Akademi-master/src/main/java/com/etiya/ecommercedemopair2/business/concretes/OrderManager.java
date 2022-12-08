package com.etiya.ecommercedemopair2.business.concretes;

import com.etiya.ecommercedemopair2.business.abstracts.CustomerService;
import com.etiya.ecommercedemopair2.business.abstracts.OrderService;
import com.etiya.ecommercedemopair2.business.abstracts.PaymentMethodService;
import com.etiya.ecommercedemopair2.business.abstracts.ShipperService;
import com.etiya.ecommercedemopair2.business.dtos.request.order.AddOrderRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.order.AddOrderResponse;
import com.etiya.ecommercedemopair2.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemopair2.entities.concretes.Customer;
import com.etiya.ecommercedemopair2.entities.concretes.Order;
import com.etiya.ecommercedemopair2.entities.concretes.PaymentMethod;
import com.etiya.ecommercedemopair2.entities.concretes.Shipper;
import com.etiya.ecommercedemopair2.repository.abstracts.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
public class OrderManager implements OrderService {
    private OrderRepository orderRepository;
    private ShipperService shipperService;
    private PaymentMethodService paymentMethodService;
    private CustomerService customerService;
    private ModelMapperService modelMapperService;
    @Override
    public List<Order> findAllOrdersOrderByOrder_date(int id) {
        return orderRepository.getAllOrdersOrderById(id);
        //return null;
    }
   /* public List<Order> findAllByProductsUnitPriceBetween(int id){
        return orderRepository.findAllProductsUnitPriceBetween(id);
    }*/

    @Override
    public AddOrderResponse addOrder(AddOrderRequest addOrderRequest) {
        Order order = modelMapperService.getMapper().map(addOrderRequest,Order.class);
        Order savedOrder = orderRepository.save(order);

        AddOrderResponse response = modelMapperService.getMapper().map(savedOrder,AddOrderResponse.class);
        return response;
    }

    @Override
    public Order getById(int id) {
        return orderRepository.findById(id).orElseThrow();
    }
}
