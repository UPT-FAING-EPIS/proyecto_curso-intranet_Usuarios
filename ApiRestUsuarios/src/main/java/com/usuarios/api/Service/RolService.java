/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usuarios.api.Service;

import com.usuarios.api.Entidad.RolDocente;
import java.util.List;
import java.util.Optional;


public interface RolService {
    public List<RolDocente> findAll();
        
    public Optional<RolDocente> findById(long id);
    
    public RolDocente add(RolDocente idrol);
    
    public RolDocente update(RolDocente idrol);
    
    public RolDocente delete(long id);
}
