package com.proyect.spring.mapper;

import com.proyect.spring.dto.ProductoDTO;
import com.proyect.spring.dto.SucursalDTO;
import com.proyect.spring.dto.VentaDTO;
import com.proyect.spring.model.Producto;
import com.proyect.spring.model.Sucursal;
import com.proyect.spring.model.Venta;

public class Mapper {


    //transfercia de mapper VentaDTO
    public static VentaDTO ToDto(Venta venta){
        if (venta == null) return null;
        
        return VentaDTO.builder()
        .id(venta.getId())
        .fecha(venta.getFecha())
        .estado(venta.getEstado())
        .build();
    }

    //tranferencia de producto a mmaper 
    public static ProductoDTO ToDto(Producto producto){  
        if (producto == null) return null ;

        return ProductoDTO.builder()
        .id(producto.getId())
        .nombre(producto.getNombre())
        .categoria(producto.getCategoria())
        .precio(producto.getPrecio())
        .cantidad(producto.getCantidad())
        .build();
    }

    public static SucursalDTO toDto(Sucursal sucursal){
        if(sucursal == null) return null;

        return SucursalDTO.builder()
        .id(sucursal.getId())
        .nombre(sucursal.getNombre())
        .Direccion(sucursal.getDireccion())
        .build();
    }

    
}
