package com.example.chamudika.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.chamudika.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String email);
}