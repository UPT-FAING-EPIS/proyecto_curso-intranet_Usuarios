/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.ApiUsuarios.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="EntAlumno")
@Table(name="tbalumnos")
public class EntAlumno implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="dnialumno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dnialumno;
    
    @Column(name="nomalumno")
    private String nomalumno;
    
    @Column(name="apealumno")
    private String apealumno;
    
    @Column(name="diralumno")
    private String diralumno;
    
    @Column(name="telefonoalumno")
    private Integer telefonoalumno;
    
    @Column(name="correoalumno")
    private String correoalumno;
    
    @Column(name="contraalumno")
    private String contraalumno;
    
    
}
