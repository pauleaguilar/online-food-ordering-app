package com.example.onlinefoodapp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name="product")
@Data
@Getter
@Setter

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;


    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private long price;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "active")
    private boolean active;

    @Column(name = "units_in_stock")
    private int units_in_stock;

    @Column(name = "date_created")
    private Date date_created;

    @Column(name = "last_updated")
    private Date last_updated;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category = new Category();




}
