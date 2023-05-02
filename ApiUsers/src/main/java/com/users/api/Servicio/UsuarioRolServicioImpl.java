/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.users.api.Servicio;

import com.users.api.Entidad.UsuarioRol;
import com.users.api.Repositorio.UsuarioRolRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioRolServicioImpl implements UsuarioRolServicio{
    
    @Autowired
    private UsuarioRolRepositorio repositorio;

    @Override
    public List<UsuarioRol> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Optional<UsuarioRol> findById(long idur) {
        return repositorio.findById(idur);
    }

    @Override
    public UsuarioRol add(UsuarioRol ur) {
        return repositorio.save(ur);
    }

    @Override
    public UsuarioRol update(UsuarioRol ur) {
        UsuarioRol objuserol=repositorio.getById(ur.getIdur());
        BeanUtils.copyProperties(ur, objuserol);
        return repositorio.save(objuserol);
    
    }
   
    
}
