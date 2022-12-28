package com.educandoweb.springbootsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springbootsystem.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
