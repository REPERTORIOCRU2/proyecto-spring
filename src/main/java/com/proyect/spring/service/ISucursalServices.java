package com.proyect.spring.service;

import java.util.List;

import com.proyect.spring.dto.SucursalDTO;

public interface ISucursalServices {

    List<SucursalDTO> getAllSucursal();
    SucursalDTO updateSucursal (Long id, SucursalDTO sucursalDTO) ;
    SucursalDTO saveSucursal(SucursalDTO sucursalDTO);
    void deleteSucursal (Long id);


}
