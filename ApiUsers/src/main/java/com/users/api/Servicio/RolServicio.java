/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.users.api.Servicio;

import com.users.api.Entidad.Rol;
import java.util.List;
import java.util.Optional;

public interface RolServicio {

    public List<Rol> findAll();

    public Optional<Rol> findById(long id);

    public Rol add(Rol r);

    public Rol update(Rol r);

    public Rol delete(long id);
}
