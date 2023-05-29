/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.users.api.Entidad;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Usuario")
@Table(name="tbusuarios")
public class Usuarios implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="dniusu")
    private String dni;
    @Column(name="contrausu")
    private String contrasenia;
    @Column(name="estusu")
    private boolean estado;
    
}
