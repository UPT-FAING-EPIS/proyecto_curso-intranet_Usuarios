/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.users.api.Servicio;

import com.users.api.Entidad.Usuarios;
import com.users.api.Repositorio.UsuarioRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{
    
    @Autowired
    private UsuarioRepositorio repositorio;

    @Override
    public List<Usuarios> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Usuarios> findById(String id) {
        return repositorio.findById(id);
    }

    @Override
    public Usuarios add(Usuarios u) {
        return repositorio.save(u);
    }

    @Override
    public Usuarios update(Usuarios u) {
        Usuarios objusuario=repositorio.getById(u.getDni());
        BeanUtils.copyProperties(u, objusuario);
        return repositorio.save(objusuario);
    }

    @Override
    public Usuarios delete(String id) {
        repositorio.deleteById(id);
        return null;
    }
    
}
