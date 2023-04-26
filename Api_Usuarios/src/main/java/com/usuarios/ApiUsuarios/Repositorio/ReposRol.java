/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usuarios.ApiUsuarios.Repositorio;

import com.usuarios.ApiUsuarios.Entidad.EntRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Reneman
 */
@Repository
public interface ReposRol extends JpaRepository<EntRol,Integer> {
    
}
