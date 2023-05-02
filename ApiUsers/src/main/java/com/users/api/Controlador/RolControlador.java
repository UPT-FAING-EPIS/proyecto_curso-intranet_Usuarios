/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.users.api.Controlador;

import com.users.api.Entidad.Rol;
import com.users.api.Servicio.RolServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rol")
public class RolControlador {
    @Autowired
    private RolServicio servicio;
    
    @GetMapping
    public List<Rol> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Rol> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public Rol add(@RequestBody Rol r){
        return servicio.add(r);
    }
    
    @PutMapping("/{id}")
    public Rol update(@PathVariable long id,@RequestBody Rol r){
        r.setId(id);
        return servicio.update(r);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRolById(@PathVariable long id) {
    servicio.delete(id);
    return ResponseEntity.ok("Rol con ID " + id + " ha sido eliminado.");
    }
}
