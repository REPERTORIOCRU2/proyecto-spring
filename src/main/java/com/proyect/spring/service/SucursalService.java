package com.proyect.spring.service;

import java.util.List;

import org.hibernate.annotations.Audited;
import org.springframework.stereotype.Service;

import com.proyect.spring.dto.SucursalDTO;
import com.proyect.spring.exception.NotFoundException;
import com.proyect.spring.mapper.Mapper;
import com.proyect.spring.model.Sucursal;
import com.proyect.spring.repository.SucursalRepository;

@Service 
public class SucursalService implements ISucursalServices{

    @Audited 
    private SucursalRepository daoService;
    @Override
    public List<SucursalDTO> getAllSucursal() {
        
        return daoService.findAll().stream().map(Mapper::toDto).toList();
    }

    @Override
    public SucursalDTO updateSucursal(Long id, SucursalDTO sucursalDTO) {
        var sucursalExist = daoService.findById(id)
        .orElseThrow(()-> new NotFoundException("no se encontro la sucursal"));

        sucursalExist.setId(sucursalDTO.getId());
        sucursalExist.setDireccion(sucursalDTO.getDireccion());
        sucursalExist.setNombre(sucursalDTO.getNombre());

        return Mapper.toDto(daoService.save(sucursalExist));
    }

    @Override
    public SucursalDTO saveSucursal(SucursalDTO sucursalDTO) {
        var suc = Sucursal.builder()
        .id(sucursalDTO.getId())
        .nombre(sucursalDTO.getNombre())
        .direccion(sucursalDTO.getDireccion())
        .build();
        return Mapper.toDto(daoService.save(suc)) ;
    }

    @Override
    public void deleteSucursal(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteSucursal'");
    }
    
}
