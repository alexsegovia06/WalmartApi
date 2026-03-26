package com.walmartapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity 
@Table(name = "products")
public class ProductEntity {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;

}
