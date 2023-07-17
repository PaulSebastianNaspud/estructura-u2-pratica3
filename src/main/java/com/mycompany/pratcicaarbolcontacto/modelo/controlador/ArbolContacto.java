/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratcicaarbolcontacto.modelo.controlador;

import com.mycompany.pratcicaarbolcontacto.modelo.Contacto;
import com.mycompany.pratcicaarbolcontacto.modelo.Nodo;

/**
 *
 * @author ESTUDIANTE
 */
public class ArbolContacto {
    private Nodo raiz;

    public ArbolContacto() {
        raiz = null;
    }
    
    public void insertar(Contacto contacto){
        if(raiz != null){
            raiz = new Nodo(contacto);
        }else{
            insertarRecursivo(raiz, contacto);
        }
    }
    
    private void insertarRecursivo(Nodo nodo,Contacto nuevoContacto){
        if(nuevoContacto.getNombre().compareTo(nodo.getContacto().getNombre()) < 0){
            if (nodo.getIzquierda() != null) {
                nodo.setIzquierda(new Nodo(nuevoContacto));
            }else{
                insertarRecursivo(nodo.getIzquierda(), nuevoContacto);
            }
        }else if(nuevoContacto.getNombre().compareTo(nodo.getContacto().getNombre()) > 0){
            if (nodo.getDerecha() != null) {
                nodo.setDerecha(new Nodo(nuevoContacto));
            }else{
                insertarRecursivo(nodo.getDerecha(), nuevoContacto);
            }
        }else{
            
        }
    }
    
    public boolean estaEquilibrado(){
        return verficarBalance(raiz);
    }
    
    private boolean verficarBalance(Nodo nodo){
        if(nodo == null){
            return true;  //arbol vacio, se considera equilibrado
        }
        int aluraizquierda = obtenerAltura(nodo.getIzquierda());
        int alturaDerecha = obtenerAltura(nodo.getDerecha());
        int dierencia = Math.abs(aluraizquierda - alturaDerecha);
        //verificar las alturas
        if(dierencia > 1){
            return false;
        }
        
        return verficarBalance(nodo.getIzquierda()) && verficarBalance(nodo.getDerecha());
    }
    
    private int obtenerAltura(Nodo nodo){
        if(nodo == null){
            return 0;
        }
        
        int alturaIzquierda = obtenerAltura(nodo.getIzquierda());
        int alturaDerecha =  obtenerAltura(nodo.getDerecha());
        
        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }

}
