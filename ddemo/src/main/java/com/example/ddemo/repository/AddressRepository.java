package com.example.ddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ddemo.model.Address;

public interface AddressRepository extends JpaRepository< Address, Long> {
    
}
