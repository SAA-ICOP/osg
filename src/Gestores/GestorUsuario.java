/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Entidades.Usuario;
import java.util.List;

/**
 *
 * @author ema_s
 */
public class GestorUsuario extends Gestor {

    public List<Usuario> listarUsuarios() throws Exception {
        List<Usuario> usuarios = null;
        try {
            iniciarTransaccion();
            usuarios = entityManager.createNamedQuery("Usuario.findAll").getResultList();
        } catch (Exception e) {
            manejarExcepcion(e);
        } finally {
            terminarTransaccion();
        }
        return usuarios;
    }

    public Usuario login(String nombreUsuario, String pass) throws Exception {
        Usuario usuario = null;
        try {
            iniciarTransaccion();
            query = entityManager.createNamedQuery("Usuario.findByNombreusuarioYpassUsuario");
            query.setParameter("nombreusuario", nombreUsuario);
            query.setParameter("passusuario", pass);
            usuario = (Usuario) query.getSingleResult();
        } catch (Exception e) {
            manejarExcepcion(e);
        } finally {
            terminarTransaccion();
        }
        return usuario;
    }
}
