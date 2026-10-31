package com.proyect.spring.dto;

import java.time.LocalDate;
import java.util.List;

import com.proyect.spring.model.DetalleVenta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter @Getter 
@NoArgsConstructor 
@AllArgsConstructor 

public class VentaDTO {
    private Long id;
    private LocalDate fecha;
    private String estado;
    //detalles de la sucursal
    private Long idSucursal;
    // lista de detalles
    private List<DetalleVenta> detalle; 

    //total de la venta
    private Double total;
}
