package com.fastfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastfood.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
    
}
