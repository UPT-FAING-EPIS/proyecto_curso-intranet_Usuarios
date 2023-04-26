/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.ApiUsuarios.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
public class EntDocente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dnidocente;
    
    private String nomdocente;
    
    private String apedocente;
    
    private String dirdocente;
    
    private Integer telefonodocente;
    
    private String correodocente;
    
    private String contradocente;
    
    
}