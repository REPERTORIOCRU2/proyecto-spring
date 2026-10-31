package com.proyect.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyect.spring.model.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {
    
}
