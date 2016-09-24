/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Entidades.Rol;
import java.util.List;

/**
 *
 * @author ema_s
 */
public class GestorRol extends Gestor {

    public List<Rol> listarRoles() throws Exception {
        List<Rol> roles = null;
        try {
            iniciarTransaccion();
            roles = entityManager.createNamedQuery("Rol.findAll").getResultList();
        } catch (Exception e) {
            manejarExcepcion(e);
        } finally {
            terminarTransaccion();
        }
        return roles;
    }

    public Rol obtenerRol(int id) throws Exception {
        Rol rol = null;
        try {
            iniciarTransaccion();
            query = entityManager.createNamedQuery("Rol.findByIdrol");
            query.setParameter("id", id);
            rol = (Rol) query.getSingleResult();
        } catch (Exception e) {
            manejarExcepcion(e);
        } finally {
            terminarTransaccion();
        }
        return rol;
    }

    public Rol obtenerRol(String nombreRol) throws Exception {
        Rol rol = null;
        try {
            iniciarTransaccion();
            query = entityManager.createNamedQuery("Rol.findByRol");
            query.setParameter("rol", nombreRol);
            rol = (Rol) query.getSingleResult();
        } catch (Exception e) {
            manejarExcepcion(e);
        } finally {
            terminarTransaccion();
        }
        return rol;
    }
}
