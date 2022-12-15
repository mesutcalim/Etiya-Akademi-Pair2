package com.etiya.ecommercedemopair2.repository.abstracts;

import com.etiya.ecommercedemopair2.business.dtos.response.order.AddOrderResponse;
import com.etiya.ecommercedemopair2.business.dtos.response.order.AddOrderWithCustomerNameResponse;
import com.etiya.ecommercedemopair2.business.dtos.response.product.AddProductResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

    List<Order> getAllOrdersOrderById(int id);

    @Query(" Select new com.etiya.ecommercedemopair2.business.dtos.response.order.AddOrderWithCustomerNameResponse(us.first_name,us.last_name,o.id,o.order_date,o.ship_date,o.shipper.id,o.paymentMethod.id,cu.id) from Order as o " +
            " inner join o.customer as cu" +
            " inner join cu.user as us ORDER BY o.id " )
    List<AddOrderWithCustomerNameResponse> orderWithCustomerName();
}
