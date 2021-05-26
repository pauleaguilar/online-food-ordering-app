package com.example.onlinefoodapp.dao;

import com.example.onlinefoodapp.entity.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "costumer", path = "costumer")
public interface CostumerRepository extends JpaRepository<Costumer, Long> {

}
