package com.proyect.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//set an get inicializacion
@Getter @Setter 
// inicializar constructor sin parametros
@NoArgsConstructor 
//iniciar constructor argumento  con paramaetro 
@AllArgsConstructor 
@Entity
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String direccion;
    
}
