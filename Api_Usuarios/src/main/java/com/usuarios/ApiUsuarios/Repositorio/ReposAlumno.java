/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usuarios.ApiUsuarios.Repositorio;

import com.usuarios.ApiUsuarios.Entidad.EntAlumno;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReposAlumno extends JpaRepository<EntAlumno,Integer>{
    @Query("Select * from tbalumnos")
    List<EntAlumno> findAllCustom();
}
