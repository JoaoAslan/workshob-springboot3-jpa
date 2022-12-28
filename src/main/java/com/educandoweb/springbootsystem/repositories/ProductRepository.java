package com.educandoweb.springbootsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springbootsystem.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
