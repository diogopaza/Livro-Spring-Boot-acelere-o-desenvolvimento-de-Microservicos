package com.fastfood.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fastfood.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{
      
}

