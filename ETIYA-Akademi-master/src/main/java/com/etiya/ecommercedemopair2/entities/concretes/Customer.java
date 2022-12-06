package com.etiya.ecommercedemopair2.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties("customer")
    private User user;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @JsonIgnoreProperties("customer")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "payment_id")
    @JsonIgnoreProperties("customer")
    private PaymentMethod paymentMethod;

    @OneToMany(mappedBy = "customer")
    @JsonIgnoreProperties("customer")
    private List<Order> orders;
}
