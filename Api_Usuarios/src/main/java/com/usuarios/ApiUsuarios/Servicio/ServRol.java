/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.ApiUsuarios.Servicio;

import org.springframework.stereotype.Service;
import com.usuarios.ApiUsuarios.Entidad.EntAlumno;
import com.usuarios.ApiUsuarios.Entidad.EntRol;
import com.usuarios.ApiUsuarios.Repositorio.ReposAlumno;
import com.usuarios.ApiUsuarios.Repositorio.ReposRol;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Reneman
 */
@Service
public class ServRol {
    @Autowired
    ReposRol reposrol;
    
    public List<EntRol> getRol(){
        return reposrol.findAll();
    }
    
    public Optional<EntRol> getRol(Integer id){
        return reposrol.findById(id);
    }
    
    public void guardar(EntRol rol){
        reposrol.save(rol);
    }
    
    public void borrar(Integer id){
        reposrol.deleteById(id);
    }
}
