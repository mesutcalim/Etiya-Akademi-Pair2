package com.etiya.ecommercedemopair2.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "color")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Color {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "color_name")
    private String color_name;

    @OneToMany(mappedBy = "color")
    @JsonIgnoreProperties("color")
    private List<Product> products;
}
