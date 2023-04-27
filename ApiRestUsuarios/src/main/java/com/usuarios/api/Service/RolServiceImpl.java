/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.api.Service;

import com.usuarios.api.Entidad.RolDocente;
import com.usuarios.api.Repositorio.RolRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolServiceImpl implements RolService{
    @Autowired
    private RolRepositorio repositorio;

    @Override
    public List<RolDocente> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Optional<RolDocente> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public RolDocente add(RolDocente idrol) {
        return repositorio.save(idrol);
    }

    @Override
    public RolDocente update(RolDocente idrol) {
        RolDocente objrol=repositorio.getById(idrol.getCodigo());
        BeanUtils.copyProperties(idrol, objrol);
        return repositorio.save(objrol);
        
    }

    @Override
    public RolDocente delete(long id) {
        repositorio.deleteById(id);
        return null;
    }
    
}
