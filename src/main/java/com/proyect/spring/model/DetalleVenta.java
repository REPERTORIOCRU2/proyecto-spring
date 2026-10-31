package com.proyect.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter 
@NoArgsConstructor 
@AllArgsConstructor 
@Entity
public class DetalleVenta {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    //venta
    @ManyToOne 
    private Venta venta;
    //producto
    @ManyToOne 
    private Producto producto;
    private Integer cantidadProducto;
    private Double precio;
}
