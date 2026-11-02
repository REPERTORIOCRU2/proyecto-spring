package com.proyect.spring.service;
import java.util.List;
import com.proyect.spring.dto.VentaDTO;

public interface IVentaServices {
   List<VentaDTO> getAllVenta();
    VentaDTO saveVenta (VentaDTO vwVentaDTO);
    VentaDTO updateVenta (Long id, VentaDTO ventaDTO);
    void deleteVenta (Long id);
}
