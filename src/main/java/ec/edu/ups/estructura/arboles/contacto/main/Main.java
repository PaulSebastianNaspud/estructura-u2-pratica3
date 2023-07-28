/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.arboles.contacto.main;

import ec.edu.ups.estructura.arboles.contacto.controlador.Controlador;
import ec.edu.ups.estructura.arboles.contacto.vista.Vista;

/**
 *
 * @author ACER
 */
public class Main {

    public static void main(String[] args) {
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista);
        controlador.iniciar();

    }
}
