package com.cineplanet.candystore_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cineplanet.candystore_service.model.Product;
import com.cineplanet.candystore_service.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getProducts() {
        return repository.getProducts();
    }
}
