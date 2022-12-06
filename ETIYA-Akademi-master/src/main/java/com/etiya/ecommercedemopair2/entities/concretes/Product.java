package com.etiya.ecommercedemopair2.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String product_name;

    @Column(name = "unit_price")
    private double unit_price;

    @Column(name = "stock")
    private int stock;

    @Column(name = "sale_count")
    private int sales_count;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonIgnoreProperties("products")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "color_id")
    @JsonIgnoreProperties("products")
    private Color color;

    @OneToMany(mappedBy = "product")
    @JsonIgnoreProperties({"product","order"})
    private List<OrderDetail> orderDetails;
}
