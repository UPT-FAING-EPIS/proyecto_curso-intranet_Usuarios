/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.ApiUsuarios.Controlador;

/**
 *
 * @author Reneman
 */
import com.usuarios.ApiUsuarios.Entidad.EntDocente;
import com.usuarios.ApiUsuarios.Entidad.EntRol;
import com.usuarios.ApiUsuarios.Servicio.ServDocente;
import com.usuarios.ApiUsuarios.Servicio.ServRol;
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
@RequestMapping(path = "api/v1/rol")
public class ControlRol {
    @Autowired
    private ServRol servrol;
    
    @GetMapping
    public List<EntRol> getAll(){
        return servrol.getRol();
    }
    
    @GetMapping("/{idrol}")
    public Optional<EntRol> getById(@PathVariable("idrol") Integer idrol){
        return servrol.getRol(idrol);
    }
    
    @PostMapping
    public void actualizar(@RequestBody EntRol rol){
        servrol.guardar(rol);
    }
    
    @DeleteMapping("/{idrol}")
    public void borrar(@PathVariable("idrol") Integer idrol){
        servrol.borrar(idrol);
    }
    
}
