package com.fastfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastfood.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    
}
