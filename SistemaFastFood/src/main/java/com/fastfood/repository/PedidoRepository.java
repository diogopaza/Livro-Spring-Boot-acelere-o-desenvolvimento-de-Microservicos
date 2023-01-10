package com.fastfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastfood.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    
}
