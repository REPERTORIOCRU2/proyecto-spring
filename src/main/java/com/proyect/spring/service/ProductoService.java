package com.proyect.spring.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyect.spring.dto.ProductoDTO;
import com.proyect.spring.exception.NotFoundException;
import com.proyect.spring.mapper.Mapper;
import com.proyect.spring.model.Producto;
import com.proyect.spring.repository.ProductoRepository;

@Service

public class ProductoService implements iProductoServices{

    @Autowired 
    private ProductoRepository daoProduc;

    @Override 
    public List<ProductoDTO> getAllProductos(){
        return daoProduc.findAll().stream().map(Mapper::ToDto).toList();
    }
    @Override 
    public ProductoDTO saveProducto(ProductoDTO producDto){

        var productoExist = Producto.builder()
        .id(producDto.getId())
        .nombre(producDto.getNombre())
        .categoria(producDto.getCategoria())
        .precio(producDto.getPrecio())
        .cantidad(producDto.getCantidad())
        .build(); 


        return  Mapper.ToDto(daoProduc.save(productoExist));
    }
    @Override 
    public void deleteProducto(Long id){
        if(!daoProduc.existsById(id)){
            new NotFoundException("No se encuentro el producto");
        }

        daoProduc.deleteById(id);

    }
    @Override 
    public ProductoDTO updateProducto(Long id ,ProductoDTO productoDTO){
        var productoExist = daoProduc.findById(id)
        .orElseThrow(()-> new NotFoundException("no se encontro el producto"))

        productoExist.setId(productoDTO.getId());
        productoExist.setNombre(productoDTO.getNombre());
        productoExist.setCategoria(productoDTO.getCategoria());
        productoExist.setPrecio(productoDTO.getPrecio());
        productoExist.setCantidad(productoDTO.getCantidad());

        
        return Mapper.ToDto(daoProduc.save(productoExist));
    }  
    
}
