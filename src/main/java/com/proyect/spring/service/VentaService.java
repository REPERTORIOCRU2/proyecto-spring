package com.proyect.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.spring.dto.VentaDTO;
import com.proyect.spring.exception.NotFoundException;
import com.proyect.spring.mapper.Mapper;
import com.proyect.spring.model.Venta;
import com.proyect.spring.repository.VentaRepository;

@Service 
public class VentaService implements IVentaServices {

    @Autowired 
    private VentaRepository daoVenta;

    @Override 
    public List<VentaDTO> getAllVenta(){
        return daoVenta.findAll().stream().map(Mapper::ToDto).toList();
    }

    public VentaDTO saveVenta(VentaDTO ventaDTO){

         var venta = Venta.builder()
        .fecha(ventaDTO.getFecha())
        .estado(ventaDTO.getEstado())
        .build();
        return Mapper.ToDto(daoVenta.save(venta));
    }

    public VentaDTO updateVenta (Long id, VentaDTO ventaDTO){
        var ventaExist = daoVenta.findById(id)
        .orElseThrow(() -> new NotFoundException("No se encontro usuario"));

        ventaExist.setFecha(ventaDTO.getFecha());
        ventaExist.setEstado(ventaDTO.getEstado());
        ventaExist.setPrecio(ventaDTO.getTotal());

        return Mapper.ToDto(daoVenta.save(ventaExist));
    }

    public void deleteVenta(Long id){

        if(!daoVenta.existsById(id)){
            new NotFoundException("No se encontro el registro");
        }
        daoVenta.deleteById(id);
    }
    
}
