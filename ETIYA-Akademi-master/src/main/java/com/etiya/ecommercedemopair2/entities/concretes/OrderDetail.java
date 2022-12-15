package com.etiya.ecommercedemopair2.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order_detail")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "coupon",nullable = true)
    private String coupon;

    @ManyToOne
    @JoinColumn(name = "order_id")
    @JsonIgnoreProperties("orderDetails")
    private Order order;

    @OneToMany
    @JoinColumn(name = "product_id")
    @JsonIgnore
    private List<Product> products;

    @OneToOne(mappedBy = "orderDetail")
    @JsonIgnore
    private Invoice invoice;

}
