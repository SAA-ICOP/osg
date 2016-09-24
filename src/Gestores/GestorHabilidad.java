/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Entidades.Habilidad;
import java.util.List;

/**
 *
 * @author ema_s
 */
public class GestorHabilidad extends Gestor {

    public List<Habilidad> listarHabilidades() throws Exception {
        List<Habilidad> habilidades = null;
        try {
            iniciarTransaccion();
            habilidades = entityManager.createNamedQuery("Habilidad.findAll").getResultList();
        } catch (Exception e) {
            manejarExcepcion(e);
        } finally {
            terminarTransaccion();
        }
        return habilidades;
    }
}
