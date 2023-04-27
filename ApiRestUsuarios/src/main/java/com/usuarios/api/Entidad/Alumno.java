/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuarios.api.Entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Entity(name="Alumno")
@Table(name="tbalumnos")
public class Alumno implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="dnialumno")
    private long dni;
    
    @Column(name="nomalumno")
    private String nombre;
    
    @Column(name="apealumno")
    private String apellido;
    
    @Column(name="diralumno")
    private String direccion;
    
    @Column(name="telefonoalumno")
    private int telefono;
    
    @Column(name="correoalumno")
    private String correo;
    
}
