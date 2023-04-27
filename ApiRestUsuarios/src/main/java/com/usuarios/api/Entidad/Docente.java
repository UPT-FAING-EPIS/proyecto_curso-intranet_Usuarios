/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.api.Entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Docente")
@Table(name="tbdocente")
public class Docente implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="dnidocente")
    private long dni;
    
    @Column(name="nomdocente")
    private String nombre;
    
    @Column(name="apedocente")
    private String apellido;
    
    @Column(name="dirdocente")
    private String direccion;
    
    @Column(name="telefonodocente")
    private int telefono;
    
    @ManyToOne
    @JoinColumn(name="fk_idrol",nullable=false)
    private RolDocente rol;
    
    @Column(name="correodocente")
    private String correo;
    
}
