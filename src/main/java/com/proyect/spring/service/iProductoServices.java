package com.proyect.spring.service;

import java.util.List;

import com.proyect.spring.dto.ProductoDTO;

public interface iProductoServices {
    List<ProductoDTO> getAllProductos();
    ProductoDTO saveProducto (ProductoDTO productoDTO);
    ProductoDTO updateProducto(Long id, ProductoDTO productoDTO);
    void deleteProducto(Long id);

}
