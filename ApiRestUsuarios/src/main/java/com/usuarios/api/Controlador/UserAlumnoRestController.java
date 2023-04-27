/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.api.Controlador;

import com.usuarios.api.Entidad.UserAlumno;
import com.usuarios.api.Service.UserAlumnoService;
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
@RequestMapping("/useralumno")
public class UserAlumnoRestController {
    @Autowired
    private UserAlumnoService servicio;
    
    @GetMapping
    public List<UserAlumno> finAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<UserAlumno> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public UserAlumno add(@RequestBody UserAlumno dni){
        return servicio.add(dni);
    }
    
    @PutMapping("/{id}")
    public UserAlumno update(@PathVariable long id,@RequestBody UserAlumno dni){
        dni.setCodigo(id);
        return servicio.update(dni);
    }
    
    @DeleteMapping("/{id}")
    public UserAlumno delete(@PathVariable long id) {
    UserAlumno objuseral = new UserAlumno();
    objuseral.setEstado(false);
    return servicio.delete(UserAlumno.builder().codigo(id).build());
    }
}
