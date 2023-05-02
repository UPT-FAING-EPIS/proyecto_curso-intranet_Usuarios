/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.users.api.Servicio;

import com.users.api.Entidad.Usuarios;
import java.util.List;
import java.util.Optional;

public interface UsuarioServicio {

    public List<Usuarios> findAll();

    public Optional<Usuarios> findById(String id);

    public Usuarios add(Usuarios u);

    public Usuarios update(Usuarios u);

    public Usuarios delete(String id);
}
