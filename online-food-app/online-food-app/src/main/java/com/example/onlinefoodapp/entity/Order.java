package com.example.onlinefoodapp.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="order")
@Data
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "order_date")
    private Date order_date;

    @Column(name = "total")
    private Long total;

    @Column(name = "food_id")
    private Long phone_number;

    @Column(name = "username")
    private Long customer_id;


}
