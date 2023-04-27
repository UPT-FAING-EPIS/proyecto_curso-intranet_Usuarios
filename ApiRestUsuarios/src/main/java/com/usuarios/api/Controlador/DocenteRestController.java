/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.api.Controlador;

import com.usuarios.api.Entidad.Docente;
import com.usuarios.api.Service.DocenteService;
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
@RequestMapping("/docente")
public class DocenteRestController {
    @Autowired
    private DocenteService servicio;
    
    @GetMapping
    public List<Docente> finAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Docente> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public Docente add(@RequestBody Docente dni){
        return servicio.add(dni);
    }
    
    @PutMapping("/{id}")
    public Docente update(@PathVariable long id,@RequestBody Docente dni){
        dni.setDni(id);
        return servicio.update(dni);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDocenteById(@PathVariable long id) {
    servicio.delete(id);
    return ResponseEntity.ok("Docente con ID " + id + " ha sido eliminado.");
    }
    
}
