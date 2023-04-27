/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usuarios.api.Repositorio;

import com.usuarios.api.Entidad.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AlumnoRepositorio extends JpaRepository<Alumno, Long> {    
    
}
