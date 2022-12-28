package com.educandoweb.springbootsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springbootsystem.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
