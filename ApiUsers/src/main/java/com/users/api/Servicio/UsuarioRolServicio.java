/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.users.api.Servicio;

import com.users.api.Entidad.UsuarioRol;
import java.util.List;
import java.util.Optional;

public interface UsuarioRolServicio {

    public List<UsuarioRol> findAll();

    public Optional<UsuarioRol> findById(long idur);

    public UsuarioRol add(UsuarioRol ur);

    public UsuarioRol update(UsuarioRol ur);
}
