/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.api.Service;

import com.usuarios.api.Entidad.Docente;
import com.usuarios.api.Repositorio.DocenteRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocenteServiceImpl implements DocenteService{
    
    @Autowired
    private DocenteRepositorio repositorio;

    @Override
    public List<Docente> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Docente> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public Docente add(Docente dni) {
        return repositorio.save(dni);
    }

    @Override
    public Docente update(Docente dni) {
        Docente objdocente=repositorio.getById(dni.getDni());
        BeanUtils.copyProperties(dni, objdocente);
        return repositorio.save(objdocente);
    }

    @Override
    public Docente delete(long id) {
        repositorio.deleteById(id);
        return null;
    }
    
}
