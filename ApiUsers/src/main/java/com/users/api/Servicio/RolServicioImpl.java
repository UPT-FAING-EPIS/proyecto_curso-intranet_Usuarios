/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.users.api.Servicio;

import com.users.api.Entidad.Rol;
import com.users.api.Repositorio.RolRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolServicioImpl implements RolServicio{
    
    @Autowired
    private RolRepositorio repositorio;

    @Override
    public List<Rol> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Rol> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public Rol add(Rol r) {
        return repositorio.save(r);
    }

    @Override
    public Rol update(Rol r) {
        Rol objrol=repositorio.getById(r.getId());
        BeanUtils.copyProperties(r, objrol);
        return repositorio.save(objrol);
    }

    @Override
    public Rol delete(long id) {
        repositorio.deleteById(id);
        return null;
    }    
}
