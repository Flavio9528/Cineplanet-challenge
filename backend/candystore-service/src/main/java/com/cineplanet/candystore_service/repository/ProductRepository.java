package com.cineplanet.candystore_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cineplanet.candystore_service.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "CALL get_products()", nativeQuery = true)
    List<Product> getProducts();
}
