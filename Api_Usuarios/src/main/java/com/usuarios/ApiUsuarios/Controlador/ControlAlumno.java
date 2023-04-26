/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.ApiUsuarios.Controlador;

import com.usuarios.ApiUsuarios.Entidad.EntAlumno;
import com.usuarios.ApiUsuarios.Servicio.ServAlumno;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControlAlumno {

    @Autowired
    private ServAlumno servalumno;
    
    @GetMapping
    public List<EntAlumno> getAll(){
        return servalumno.getAlumno();
    }
    
    @GetMapping("/{dnialumno}")
    public Optional<EntAlumno> getById(@PathVariable("dnialumno") Integer dnialumno){
        return servalumno.getAlumno(dnialumno);
    }
    
    @PostMapping
    public void actualizar(@RequestBody EntAlumno alumno){
        servalumno.guardar(alumno);
    }
    
    @DeleteMapping("/{dnialumno}")
    public void borrar(@PathVariable("dnialumno") Integer dnialumno){
        servalumno.borrar(dnialumno);
    }
}
