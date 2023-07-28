/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.arboles.contacto.vista;

import ec.edu.ups.estructura.arboles.contacto.modelo.Contacto;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Vista {
    //se usa el Scanner para que el usuario ingrese la informacion

     private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenuPrincipal() {
        while (true) {
            try {

                System.out.println("===== MENU PRINCIPAL =====");
                System.out.println("1. Agregar contacto");
                System.out.println("2. Buscar contacto por el nombre");
                System.out.println("3. Eliminar contacto por el nombre");
                System.out.println("4. Agregar un correo");
                System.out.println("5. Agregar una red social");
                System.out.println("6. Imprimir el arbol segun el recorrido: ");
                System.out.println("7. Obtener el numero de contactos totales");
                System.out.println("8. Obtener el numero de niveles del arbol");
                System.out.println("0. Salir");
                System.out.print("Ingrese una opción: ");
                //ingreso de opcion
                int opcion = scanner.nextInt();
                scanner.nextLine();
                return opcion;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Error: Ingrese un valot valido");

            }
        }

    }

    
    public int mostrarMenuImprimir() {
        //menu
        while (true) {
            try {
                System.out.println("    ===== MENU IMPRIMIR ARBOL SEGUN EL RECORRIDO: =====");
                System.out.println("    1. Preorder");
                System.out.println("    2. Inorder");
                System.out.println("    3. PostOrder");
                System.out.println("    4. Anchura");
                System.out.println("    0. Salir");
                System.out.print("Ingrese una opción: ");
                //ingreso de opcion
                int opcion = scanner.nextInt();
                scanner.nextLine();
                return opcion;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Error: Ingrese un valot valido");

            }
        }
    }
    
    public boolean validacionActuzalizar(String nombre){
        while (true) {
            try {
                System.out.println("El contacto con nombre: " + nombre + " no existe");
                System.out.println("¿Desea ingresar un nuevo contacto con el nombre: " + nombre + " ?");
                System.out.println("Ingrese una opcion: \n 1. Si \n 2. No");
                //ingreso de opcion
                
                System.out.println("Ingrese la opcion deseada: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();
                
                if(opcion == 1){
                    return true;
                }else if(opcion == 2){
                    return false;
                }else{
                    System.out.println("Ingrese una opcion valida");
                }
                
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Error: Ingrese un valot valido");

            }
        }
    }


    public String pedirNombre() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    public String pedirNombreBuscar() {
        System.out.print("Ingrese el nombre a buscar: ");
        return scanner.nextLine();
    }

    public String pedirTelefono() {
        System.out.print("Ingrese su telefono: ");
        return scanner.nextLine();
    }

    public String pedirRedSocial() {
        System.out.print("Ingrese la red social que desea agregar: ");
        return scanner.nextLine();
    }

    public String pedirLink() {
        System.out.print("Ingrese el link: ");
        return scanner.nextLine();
    }

    public String pedirCorreo() {
        System.out.print("Ingrese su correo: ");
        return scanner.nextLine();
    }

    /// Muestra un mensaje 
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public void imprimirContacto(Contacto contacto){
        System.out.println(contacto);
    }
}
