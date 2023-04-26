/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.ApiUsuarios.Servicio;

import com.usuarios.ApiUsuarios.Entidad.EntAlumno;
import com.usuarios.ApiUsuarios.Repositorio.ReposAlumno;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServAlumno {
    @Autowired
    ReposAlumno reposalumno;
    
    public List<EntAlumno> getAlumno(){
        return reposalumno.findAll();
    }
    
    public Optional<EntAlumno> getAlumno(Integer id){
        return reposalumno.findById(id);
    }
    
    public void guardar(EntAlumno alumno){
        reposalumno.save(alumno);
    }
    
    public void borrar(Integer id){
        reposalumno.deleteById(id);
    }
}
