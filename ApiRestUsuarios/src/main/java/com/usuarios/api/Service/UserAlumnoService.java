/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usuarios.api.Service;

import com.usuarios.api.Entidad.UserAlumno;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author renat
 */
public interface UserAlumnoService {
    public List<UserAlumno> findAll();
        
    public Optional<UserAlumno> findById(long id);
    
    public UserAlumno add(UserAlumno dni);
    
    public UserAlumno update(UserAlumno dni);
    
    public UserAlumno delete(UserAlumno dni);
}
