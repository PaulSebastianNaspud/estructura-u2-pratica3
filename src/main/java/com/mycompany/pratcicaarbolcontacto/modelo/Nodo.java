/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratcicaarbolcontacto.modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class Nodo {
    
    private Contacto contacto;
    
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(Contacto contacto) {
        this.contacto = contacto;
        izquierda = null;
        derecha = null;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    @Override
    public String toString() {
        return "Nodo{" + "contacto=" + contacto + ", izquierda=" + izquierda + ", derecha=" + derecha + '}';
    }
    
    
    
    
}
