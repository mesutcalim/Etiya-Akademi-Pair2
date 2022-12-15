package com.etiya.ecommercedemopair2.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shipper")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Shipper {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "company_name")
    private String company_name;

    @Column(name = "phone_number")
    private String phone_number;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @JsonIgnoreProperties({"salesman","customer","shipper"})
    private Role role;

    @OneToMany(mappedBy = "shipper")
    @JsonIgnoreProperties({"shipper","order"})
    private List<Order> order;
}
