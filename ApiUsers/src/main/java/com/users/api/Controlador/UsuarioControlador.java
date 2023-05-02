/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.users.api.Controlador;

import com.users.api.Entidad.Usuarios;
import com.users.api.Servicio.UsuarioServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {
    @Autowired
    private UsuarioServicio servicio;
    
    @GetMapping
    public List<Usuarios> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Usuarios> findById(@PathVariable String id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public Usuarios add(@RequestBody Usuarios u){
        return servicio.add(u);
    }
    
    @PutMapping("/{id}")
    public Usuarios update(@PathVariable String id,@RequestBody Usuarios u){
        u.setDni(id);
        return servicio.update(u);
    }
    
    @DeleteMapping("/{id}")
    public Usuarios delete(@PathVariable String id) {
    Optional<Usuarios> usuarioAActualizar = servicio.findById(id);
        if (usuarioAActualizar.isPresent()) {
            Usuarios usuarioActualizado = usuarioAActualizar.get();
            usuarioActualizado.setEstado(false);
            servicio.update(usuarioActualizado);
            return usuarioActualizado;
        } else {
            return null;
        }
    }
}
