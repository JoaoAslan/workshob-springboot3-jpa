package com.educandoweb.springbootsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springbootsystem.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
