package com.etiya.ecommercedemopair2.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "unit_price")
    private double unit_price;

    @Column(name = "stock")
    private int stock;

    @Column(name = "sale_count")
    private int saleCount;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Category.class)
    @JoinColumn(name = "category_id")
    @JsonIgnoreProperties("product")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "color_id")
    @JsonIgnore
    private Color color;

    @ManyToOne
    @JsonIgnore
    private OrderDetail orderDetails;
}
