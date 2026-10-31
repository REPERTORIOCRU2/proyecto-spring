package com.proyect.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter 
@NoArgsConstructor 
@AllArgsConstructor 
public class ProductoDTO {
    private Long id;
    private String nombre;
    private String Categoria;
    private Double precio;
    private int cantidad;
    
}
