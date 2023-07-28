/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.arboles.contacto.modelo;

/**
 *
 * @author ACER
 */
public class Node {
    private Contacto contacto;
    private Node izquierda;
    private Node derecha;

    public Node(Contacto contacto) {
        this.contacto = contacto;
        this.izquierda = null;
        this.derecha = null;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public Node getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Node izquierda) {
        this.izquierda = izquierda;
    }

    public Node getDerecha() {
        return derecha;
    }

    public void setDerecha(Node derecha) {
        this.derecha = derecha;
    }
   
    
    
    
}
