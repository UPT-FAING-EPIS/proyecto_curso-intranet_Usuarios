/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.ApiUsuarios.Controlador;

import com.usuarios.ApiUsuarios.Entidad.EntDocente;
import com.usuarios.ApiUsuarios.Servicio.ServDocente;
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
@RequestMapping(path = "api/v1/docente")
public class ControlDocente {

    @Autowired
    private ServDocente servdocente;
    
    @GetMapping
    public List<EntDocente> getAll(){
        return servdocente.getDocente();
    }
    
    @GetMapping("/{dnidocente}")
    public Optional<EntDocente> getById(@PathVariable("dnidocente") Integer dnidocente){
        return servdocente.getDocente(dnidocente);
    }
    
    @PostMapping
    public void actualizar(@RequestBody EntDocente docente){
        servdocente.guardar(docente);
    }
    
    @DeleteMapping("/{dnidocente}")
    public void borrar(@PathVariable("dnidocente") Integer dnidocente){
        servdocente.borrar(dnidocente);
    }
}
