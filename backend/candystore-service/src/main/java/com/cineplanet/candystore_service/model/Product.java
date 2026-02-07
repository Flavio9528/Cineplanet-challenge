package com.cineplanet.candystore_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "candystore")
public class Product {
    @Id
    private Long id;

    private String name;
    private String description;
    private Double price;

    public Product() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }
}
