/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.api.Service;

import com.usuarios.api.Entidad.UserAlumno;
import com.usuarios.api.Repositorio.UserAlumnoRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAlumnoServiceImpl implements UserAlumnoService{
    @Autowired
    private UserAlumnoRepositorio repositorio;

    @Override
    public List<UserAlumno> findAll() {
        return repositorio.findAll();
    }


    @Override
    public Optional<UserAlumno> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public UserAlumno add(UserAlumno dni) {
        return repositorio.save(dni);
    }

    @Override
    public UserAlumno update(UserAlumno dni) {
        UserAlumno objusera=repositorio.getById(dni.getCodigo());
        BeanUtils.copyProperties(dni, objusera);
        return repositorio.save(objusera);
    }

    @Override
    public UserAlumno delete(UserAlumno dni) {
        UserAlumno objusera=repositorio.getById(dni.getCodigo());
        objusera.setEstado(false);
        return repositorio.save(objusera);
    }
    
}
