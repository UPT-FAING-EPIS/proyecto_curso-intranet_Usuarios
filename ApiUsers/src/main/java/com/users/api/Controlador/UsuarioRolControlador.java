/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.users.api.Controlador;

import com.users.api.Entidad.UsuarioRol;
import com.users.api.Servicio.UsuarioRolServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuariorol")
public class UsuarioRolControlador {
    @Autowired
    private UsuarioRolServicio servicio;
    
    @GetMapping
    public List<UsuarioRol> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/{idur}")
    public Optional<UsuarioRol> findById(@PathVariable long idur){
        return servicio.findById(idur);
    }
    
    @PostMapping
    public UsuarioRol add(@RequestBody UsuarioRol ur){
        return servicio.add(ur);
    }
    
    @PutMapping("/{idur}")
    public UsuarioRol update(@PathVariable long idur,@RequestBody UsuarioRol ur){
        ur.setIdur(idur);
        return servicio.update(ur);
    }    
       
}
