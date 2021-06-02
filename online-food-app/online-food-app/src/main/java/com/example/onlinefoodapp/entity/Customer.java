package com.example.onlinefoodapp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;


@Entity
@Table(name="customer")
@Data
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "customer_fname")
    private String customer_fname;

    @Column(name = "customer_lname")
    private String customer_lname;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

}
