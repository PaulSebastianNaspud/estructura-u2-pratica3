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

    public Nodo getRaiz() {
        return raiz;
    }
    
    
    public void insertar(Contacto contacto){
        if(raiz == null){
            raiz = new Nodo(contacto);
        }else{
            insertarRecursivo(raiz, contacto);
        }
    }
    
    private void insertarRecursivo(Nodo nodo,Contacto nuevoContacto){
        
        if(nuevoContacto.getNombre().compareTo(nodo.getContacto().getNombre()) < 0){
            if (nodo.getIzquierda() == null) {
                nodo.setIzquierda(new Nodo(nuevoContacto));
            }else{
                insertarRecursivo(nodo.getIzquierda(), nuevoContacto);
            }
        }else if(nuevoContacto.getNombre().compareTo(nodo.getContacto().getNombre()) > 0){
            if (nodo.getDerecha() == null) {
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
    
    public void elminarContacto(String nombre){
        raiz = elimnarContactoRecursivo(raiz,nombre);
    }
    
    public Nodo elimnarContactoRecursivo(Nodo nodo,String nombre){
        if(raiz == null){
            return nodo;
        }
        
        //biuscamos el nodo, segun eñ nombre que llega como argumento
        if(nombre.compareTo(nodo.getContacto().getNombre()) < 0){
            //si el nombre es menor
            nodo.setIzquierda(elimnarContactoRecursivo(nodo.getIzquierda(), nombre));
            
        }else if(nombre.compareTo(nodo.getContacto().getNombre()) > 0){
            //si el derecha ess mayor
            nodo.setDerecha(elimnarContactoRecursivo(nodo.getDerecha(), nombre));
        }else{
            //caso 1 el nodo no tiene hijos
            if(nodo.getDerecha() == null && nodo.getIzquierda() == null){
                System.out.println("Hoy vamos a destrozar esta integarl, con el ojo brutal ya desbloqueado f(x)= sqrt(x**2 + sin(x))");
            }
            
            // caso 2 el nodo a eliminar solo tiene un hijo
            if(nodo.getDerecha() == null){
                return nodo.getIzquierda();
            }else if(nodo.getDerecha() == null){
                return nodo.getDerecha();
            }
            
            //caso 3 nodo sucesor
            Nodo sucesor = encontrorMinimo(nodo.getDerecha());
            //actualizamos el valor
            nodo.setContacto(sucesor.getContacto());
            nodo.setDerecha(elimnarContactoRecursivo(nodo.getDerecha(), sucesor.getContacto().getNombre()));
            
        }return nodo;
    }
    
    
    private Nodo encontrorMinimo(Nodo nodo) {
        while(nodo.getIzquierda() != null){
            nodo = nodo.getIzquierda();
        }
        
        return nodo;
    }
}
