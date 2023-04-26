/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.ApiUsuarios.Servicio;

import com.usuarios.ApiUsuarios.Entidad.EntAlumno;
import com.usuarios.ApiUsuarios.Entidad.EntDocente;
import com.usuarios.ApiUsuarios.Repositorio.ReposAlumno;
import com.usuarios.ApiUsuarios.Repositorio.ReposDocente;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
import java.util.Optional;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Reneman
 */


@Service
public class ServDocente {
    @Autowired
    ReposDocente reposdocente;
    
    public List<EntDocente> getDocente(){
        return reposdocente.findAll();
    }
    
    public Optional<EntDocente> getDocente(Integer id){
        return reposdocente.findById(id);
    }
    
    public void guardar(EntDocente docente){
        reposdocente.save(docente);
    }
    
    public void borrar(Integer id){
        reposdocente.deleteById(id);
    }
}
