/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Entidades.Habilidad;
import Entidades.Rol;
import Entidades.Usuario;
import Gestores.GestorHabilidad;
import Gestores.GestorUsuario;
import Gestores.GestorRol;
import java.util.List;

/**
 *
 * @author ema_s
 */
public class SeguridadController {

    public boolean guardarActualizarUsuario(Usuario usuario) throws Exception {
        boolean guardado = new GestorUsuario().guardarOActualizar(usuario);
        return guardado;
    }

    public List<Habilidad> listarHabilidades() throws Exception {
        List<Habilidad> habilidades = new GestorHabilidad().listarHabilidades();
        if (habilidades != null) {
            return habilidades;
        } else {
            throw new Exception("Ocurrio un error al querer obtener las habilidades. Comuniquese con el admin");
        }
    }

    public List<Rol> listarRoles() throws Exception {
        List<Rol> roles = new GestorRol().listarRoles();
        if (roles != null) {
            return roles;
        } else {
            throw new Exception("Ocurrio un error al querer obtener todos los roles. Comuniquese con el admin");
        }
    }

    public Rol obtenerRol(int id) throws Exception {
        Rol rol = new GestorRol().obtenerRol(id);
        if (rol != null) {
            return rol;
        } else {
            throw new Exception("Ocurrio un error al querer obtener el rol. Comuniquese con el admin");
        }
    }

    public Rol obtenerRol(String nombreRol) throws Exception {
        Rol rol = new GestorRol().obtenerRol(nombreRol);
        if (rol != null) {
            return rol;
        } else {
            throw new Exception("Ocurrio un error al querer obtener el rol. Comuniquese con el admin");
        }
    }

    public Usuario login(String nombreUsuario, String passUsuario) throws Exception {
        Usuario usuario = new GestorUsuario().login(nombreUsuario, passUsuario);
        if (usuario != null) {
            return usuario;
        } else {
            throw new Exception("Ocurrio un error al querer loguearse. Comuniquese con el admin");
        }
    }
}
