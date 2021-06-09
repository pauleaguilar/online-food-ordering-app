package com.example.onlinefoodapp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name="cart")
@Data
public class Cart {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "created_date")
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Product product;


    private int quantity;

    public Cart() {
    }


    public Cart(CartDto cartDto, Product product,int userId){
        this.userId = userId;
        this.productId = cartDto.getProductId();
        this.quantity = cartDto.getQuantity();
        this.product = product;
        this.createdDate = new Date();
    }

    public Cart(Long userId, Long productId, int quantity) {
        this.userId = userId;
        this.productId = productId;
        this.createdDate = new Date();
        this.quantity = quantity;
    }

    public Cart(CartDto cartDto, Product product) {
        this.productId = cartDto.getProductId();
        this.quantity = cartDto.getQuantity();
        this.product = product;
        this.createdDate = new Date();
    }
}
