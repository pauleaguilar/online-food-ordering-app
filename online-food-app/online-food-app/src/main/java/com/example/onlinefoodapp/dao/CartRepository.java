package com.example.onlinefoodapp.dao;


import com.example.onlinefoodapp.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cart", path = "cart")
public interface CartRepository extends JpaRepository <Cart, Long> {


}
