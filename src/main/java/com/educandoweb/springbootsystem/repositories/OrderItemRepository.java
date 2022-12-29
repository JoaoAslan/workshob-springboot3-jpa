package com.educandoweb.springbootsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springbootsystem.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
