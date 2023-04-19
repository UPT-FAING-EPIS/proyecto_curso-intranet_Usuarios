/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intranet.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbusuario")
public class usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idusuario;
    
    @Column(name = "nombre", nullable = false,length = 100)
    private String nomusuario;
    
    @Column(name = "nombre", nullable = false,length = 100)
    private String contrausuario;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fk_idrol;    
    
}
