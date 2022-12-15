package com.etiya.ecommercedemopair2.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_date")
    private Date order_date;

    @Column(name = "ship_date")
    private Date ship_date;

    @ManyToOne
    @JoinColumn(name = "shipper_id")
    @JsonIgnoreProperties("order")
    private Shipper shipper;

    @ManyToOne
    @JoinColumn(name = "payment_id")
    @JsonIgnoreProperties("order")
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonIgnoreProperties("order")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    @JsonIgnoreProperties("order")
    private List<OrderDetail> orderDetails;
}
