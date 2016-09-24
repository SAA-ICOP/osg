/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import java.sql.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author ema_s
 */
public class Gestor {

    private EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;
    protected EntityTransaction transaccion;
    protected Query query;

    protected void iniciarTransaccion() {
        entityManagerFactory = Persistence.createEntityManagerFactory("GestionComercioPU");
        entityManager = entityManagerFactory.createEntityManager();
        transaccion = entityManager.getTransaction();
        transaccion.begin();
    }

    protected void manejarExcepcion(Exception e) throws Exception {
        transaccion.rollback();
        throw new Exception("Ocurrió un error en la capa de acceso a datos " + e.getMessage());
    }

    protected void terminarTransaccion() {
        if (transaccion.isActive()) {
            transaccion.commit();
        }
        entityManager.close();
    }

    public boolean guardarOActualizar(Object obj) throws Exception {
        boolean ok = false;
        if (obj == null) {
            throw new Exception("El objeto no puede estar en nulo.");
        } else {
            try {
                iniciarTransaccion();
                entityManager.merge(obj);
                ok = true;
            } catch (Exception e) {
                manejarExcepcion(e);
            } finally {
                terminarTransaccion();
            }
        }

        return ok;
    }

    public boolean darDeBaja(Object obj) throws Exception {
        boolean ok = false;
        if (obj == null) {
            throw new Exception("El objeto no puede estar en nulo.");
        } else {
            String tabla = obj.getClass().toString();
            java.util.Date fecha1 = new java.util.Date();
            Date fechaActual = new Date(fecha1.getTime());
            try {
                iniciarTransaccion();
                query = entityManager.createQuery("UPDATE :tabla SET :tabla.fechabaja = :fechaActual");
                query.setParameter("tabla", tabla);
                query.setParameter("fechaActual", fechaActual);
                ok = true;
            } catch (Exception e) {
                manejarExcepcion(e);
            } finally {
                terminarTransaccion();
            }
        }
        return ok;
    }
}
