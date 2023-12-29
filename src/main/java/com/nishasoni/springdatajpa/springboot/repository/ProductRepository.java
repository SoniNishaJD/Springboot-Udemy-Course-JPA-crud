package com.nishasoni.springdatajpa.springboot.repository;

import com.nishasoni.springdatajpa.springboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
