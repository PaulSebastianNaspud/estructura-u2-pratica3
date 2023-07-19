/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratcicaarbolcontacto;

import com.mycompany.pratcicaarbolcontacto.modelo.Contacto;
import com.mycompany.pratcicaarbolcontacto.modelo.Nodo;
import com.mycompany.pratcicaarbolcontacto.modelo.controlador.ArbolContacto;

/**
 *
 * @author ESTUDIANTE
 */
public class PratcicaArbolContacto {
    public static void printTreeNode(Nodo root,String prefix, boolean isLeft){
        if(root != null){
            System.out.println(prefix + (isLeft ? "└" : "+") + root.getContacto());
            printTreeNode(root.getIzquierda(), prefix + (isLeft ? "| ":" "),true);
            printTreeNode(root.getDerecha(), prefix + (isLeft ? "| ":" "), true);
        }
    }
    public static void main(String[] args) {
        ArbolContacto arbol = new ArbolContacto();
        
        Contacto c1 = new Contacto("12345", "Juan");
        Contacto c2 = new Contacto("12345", "Maria");
        Contacto c3 = new Contacto("12345", "PedroXavier");
        Contacto c4 = new Contacto("12345", "Pablo");
        
        arbol.insertar(c1);
        arbol.insertar(c2);
        arbol.insertar(c3);
        arbol.insertar(c4);
        arbol.insertar(new Contacto("12345","Juliana"));
        arbol.insertar(new Contacto("12345","Jhon"));
        arbol.insertar(new Contacto("12345","Jhonn"));
        
        arbol.elminarContacto("Jhon");
        printTreeNode(arbol.getRaiz(), "", true);
        
    }
}
