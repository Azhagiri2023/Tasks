package com.giriaim.inventoryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giriaim.inventoryapp.entity.Products;

public interface ProdRepository extends JpaRepository<Products, Long>{
    
}
