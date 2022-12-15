package com.etiya.ecommercedemopair2.entities.concretes;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "invoice")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Invoice {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name = "customer_name")
    private String customerName;


    @Column(name = "invoice_date")
    private LocalDate invoice_date;


    @Column(name = "total")
    private double total;

    @OneToOne
    @JoinColumn(name = "orderdetails_id")
    private OrderDetail orderDetail;

}
