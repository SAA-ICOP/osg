/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Entidades.Rol;
import Entidades.Usuario;
import Negocio.SeguridadController;

/**
 *
 * @author ema_s
 */
public class prueba {

    public static void main(String[] args) {
        SeguridadController seguridad = new SeguridadController();
        try {
            Usuario usuario = seguridad.login("eseiguer", "123456");
            if (usuario != null) {
                System.out.println("Hola " + usuario.getNombre() + " Bienvenido");
            } else {
                System.out.println("Ocurrio un error papu");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
