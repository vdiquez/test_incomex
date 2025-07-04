package com.intcomex.productapi.domain.repository;

import com.intcomex.productapi.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
