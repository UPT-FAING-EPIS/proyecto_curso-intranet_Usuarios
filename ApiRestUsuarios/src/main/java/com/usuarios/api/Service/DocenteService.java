/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usuarios.api.Service;

import com.usuarios.api.Entidad.Docente;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author renat
 */
public interface DocenteService {
    public List<Docente> findAll();
         
    public Optional<Docente> findById(long id);
    
    public Docente add(Docente dni);
    
    public Docente update(Docente dni);
    
    public Docente delete(long id);
}
