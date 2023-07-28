/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.arboles.contacto.modelo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author ACER
 */
public class Contacto {
    private String nombre;
    private String numeroTelefonico;
    LinkedList<String> correos;
    Map<String ,String> redSociales;
    
    
    public Contacto(String nombre, String numeroTelefonico) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.correos = new  LinkedList<>();
        this.redSociales = new HashMap<>();
    }
    
    public void ingresarCorreo(String correo){
        correos.add(correo);
    }
    
    public void ingresarRedSocial(String redSocial, String link){
        redSociales.put(redSocial, link);
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public LinkedList<String> getCorreos() {
        return correos;
    }

    public void setCorreos(LinkedList<String> correos) {
        this.correos = correos;
    }

    public Map<String, String> getRedSociales() {
        return redSociales;
    }

    public void setRedSociales(Map<String, String> redSociales) {
        this.redSociales = redSociales;
    }
    
    
    public void imprimir (){
        System.out.println("  correos: ");
        for (String correo : correos) {
            System.out.println("      "+correo);
        }
        System.out.println("  redes sociales: ");
        for (Map.Entry<String, String> entry : redSociales.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("      "+key + ": " + val);
        }
        
    }


    @Override
    public String toString() {
        return "CONTACTO: nombre: " + nombre + " telefono: " + numeroTelefonico + " correos: " + correos + " redes sociales: " + redSociales +"\n";
    }
        
}
