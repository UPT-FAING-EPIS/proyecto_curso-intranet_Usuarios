/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.users.api.Entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Entity(name = "UsuarioRol")
@Table(name = "tbusuarios_roles")
public class UsuarioRol implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="iduserrol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idur;
    
    @ManyToOne
    @JoinColumn(name = "fk_dniusu", nullable = false)
    private Usuarios fk_dni;
    
    @ManyToOne
    @JoinColumn(name = "fk_idrol", nullable = false)
    private Rol fk_rol;
}
