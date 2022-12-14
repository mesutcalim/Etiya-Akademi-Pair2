package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.business.dtos.request.order.AddOrderRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.order.AddOrderResponse;
import com.etiya.ecommercedemopair2.business.dtos.response.order.AddOrderWithCustomerNameResponse;
import com.etiya.ecommercedemopair2.core.util.results.DataResult;
import com.etiya.ecommercedemopair2.entities.concretes.Order;

import java.util.List;

public interface OrderService {
    DataResult<List<Order>> findAllOrdersOrderByOrder_date(int id);

    DataResult<Order> getById(int order_id);

    DataResult<AddOrderResponse> addOrder(AddOrderRequest addOrderRequest);

    DataResult<List<AddOrderWithCustomerNameResponse>> orderWithCustomerName();
}
