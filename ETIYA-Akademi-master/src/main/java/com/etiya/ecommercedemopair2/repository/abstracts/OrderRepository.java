package com.etiya.ecommercedemopair2.repository.abstracts;

import com.etiya.ecommercedemopair2.entities.concretes.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {

    @Query("SELECT o FROM Order o WHERE o.paymentMethod = :id")
    List<Order> findAllProductsUnitPriceBetween(int id);

    List<Order> getAllOrdersOrderById(int id);
}
