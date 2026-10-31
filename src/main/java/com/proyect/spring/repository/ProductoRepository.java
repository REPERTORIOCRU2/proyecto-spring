package com.proyect.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyect.spring.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto , Long>{
    
}
