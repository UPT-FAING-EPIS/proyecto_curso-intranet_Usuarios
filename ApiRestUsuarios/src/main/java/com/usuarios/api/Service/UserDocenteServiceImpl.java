/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.api.Service;

import com.usuarios.api.Entidad.UserDocente;
import com.usuarios.api.Repositorio.UserDocenteRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDocenteServiceImpl implements UserDocenteService{
    @Autowired
    private UserDocenteRepositorio repositorio;

    @Override
    public List<UserDocente> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Optional<UserDocente> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public UserDocente add(UserDocente dni) {
        return repositorio.save(dni);
    }

    @Override
    public UserDocente update(UserDocente dni) {
        UserDocente objuserdoc=repositorio.getById(dni.getCodigo());
        BeanUtils.copyProperties(dni, objuserdoc);
        return repositorio.save(objuserdoc);
    }

    @Override
    public UserDocente delete(UserDocente dni) {
        UserDocente objuserdoc=repositorio.getById(dni.getCodigo());
        objuserdoc.setEstado(false);
        return repositorio.save(objuserdoc);
    }
    
}
