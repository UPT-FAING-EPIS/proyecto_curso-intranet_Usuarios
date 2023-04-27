/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.api.Controlador;

import com.usuarios.api.Entidad.RolDocente;
import com.usuarios.api.Service.RolService;
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
public class RolDocenteRestController {
    @Autowired
    private RolService servicio;
    
    @GetMapping
    public List<RolDocente> finAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<RolDocente> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public RolDocente add(@RequestBody RolDocente idrol){
        return servicio.add(idrol);
    }
    
    @PutMapping("/{id}")
    public RolDocente update(@PathVariable long id,@RequestBody RolDocente idrol){
        idrol.setCodigo(id);
        return servicio.update(idrol);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRolDocenteById(@PathVariable long id) {
    servicio.delete(id);
    return ResponseEntity.ok("Rol con ID " + id + " ha sido eliminado.");
    }
}
