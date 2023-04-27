/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.api.Controlador;

import com.usuarios.api.Entidad.UserDocente;
import com.usuarios.api.Service.UserDocenteService;
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
@RequestMapping("/userdocente")
public class UserDocenteRestController {
    @Autowired
    private UserDocenteService servicio;
    
    @GetMapping
    public List<UserDocente> finAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<UserDocente> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public UserDocente add(@RequestBody UserDocente dni){
        return servicio.add(dni);
    }
    
    @PutMapping("/{id}")
    public UserDocente update(@PathVariable long id,@RequestBody UserDocente dni){
        dni.setCodigo(id);
        return servicio.update(dni);
    }
    
    @DeleteMapping("/{id}")
    public UserDocente delete(@PathVariable long id) {
    UserDocente objuserdoc = new UserDocente();
    objuserdoc.setEstado(false);
    return servicio.delete(UserDocente.builder().codigo(id).build());
    }
}
