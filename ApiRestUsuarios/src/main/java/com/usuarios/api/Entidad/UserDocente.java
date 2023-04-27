/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.api.Entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="UserDocente")
@Table(name="tbusuario_docente")
public class UserDocente implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="idusuariodoc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    
    @Column(name="fk_dnidocente")
    private int dni;
    
    @Column(name="contradocente")
    private String contrasenia;
    
    @Column(name="estado")
    private boolean estado;
    
}
