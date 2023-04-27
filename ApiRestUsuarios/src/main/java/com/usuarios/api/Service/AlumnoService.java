/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usuarios.api.Service;

import com.usuarios.api.Entidad.Alumno;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author renat
 */
public interface AlumnoService {
    public List<Alumno> findAll();
        
    public Optional<Alumno> findById(long id);
    
    public Alumno add(Alumno dni);
    
    public Alumno update(Alumno dni);
    
    public Alumno delete(long id);
    
    
}
