/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.api.Service;

import com.usuarios.api.Entidad.Alumno;
import com.usuarios.api.Repositorio.AlumnoRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl implements AlumnoService{
    
    @Autowired
    private AlumnoRepositorio repositorio;

    @Override
    public List<Alumno> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Alumno> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public Alumno add(Alumno dni) {
        return repositorio.save(dni);
    }

    @Override
    public Alumno update(Alumno dni) {
        Alumno objalumno=repositorio.getById(dni.getDni());
        BeanUtils.copyProperties(dni, objalumno);
        return repositorio.save(objalumno);
    }

    @Override
    public Alumno delete(long id) {
        repositorio.deleteById(id);
        return null;
    }
    
}
