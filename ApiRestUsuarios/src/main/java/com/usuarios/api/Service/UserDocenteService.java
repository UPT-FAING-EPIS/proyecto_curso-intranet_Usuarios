/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usuarios.api.Service;

import com.usuarios.api.Entidad.UserDocente;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author renat
 */
public interface UserDocenteService {
    public List<UserDocente> findAll();
            
    public Optional<UserDocente> findById(long id);
    
    public UserDocente add(UserDocente dni);
    
    public UserDocente update(UserDocente dni);
    
    public UserDocente delete(UserDocente dni);
}
