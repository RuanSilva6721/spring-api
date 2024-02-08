package com.ruan.spring.repositories;

import com.ruan.spring.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Integer> {
}
