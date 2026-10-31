package com.proyect.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyect.spring.model.Sucursal;


public interface SucursalRepository extends JpaRepository<Sucursal, Long >{
    
}
