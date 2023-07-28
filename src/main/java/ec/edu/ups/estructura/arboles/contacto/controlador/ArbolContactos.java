/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.arboles.contacto.controlador;

import ec.edu.ups.estructura.arboles.contacto.modelo.Contacto;
import ec.edu.ups.estructura.arboles.contacto.modelo.Node;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ACER
 */
public class ArbolContactos {

    private Node raiz;

    public ArbolContactos() {
        this.raiz = null;
    }

    public void insert(Contacto newContacto) {
        if (raiz == null) {
            raiz = new Node(newContacto);
        } else {
            insertResursivo(raiz, newContacto);
        }
    }

    public Node getRoot() {
        return raiz;
    }

    private void insertResursivo(Node node, Contacto newContacto) {
        if (newContacto.getNombre().compareTo(node.getContacto().getNombre()) < 0) {
            if (node.getIzquierda() == null) {
                node.setIzquierda(new Node(newContacto));
            } else {
                insertResursivo(node.getIzquierda(), newContacto);
            }
        } else if (newContacto.getNombre().compareTo(node.getContacto().getNombre()) > 0) {
            if (node.getDerecha() == null) {
                node.setDerecha(new Node(newContacto));
            } else {
                insertResursivo(node.getDerecha(), newContacto);
            }
        } else {
            //Si el contacto es igual a uno existente
        }
    }

    public void inorderRecursivo(Node node) {
        if (node != null) {
            inorderRecursivo(node.getIzquierda());
            System.out.print(node.getContacto() + " - ");
            inorderRecursivo(node.getDerecha());

        }
    }
    
    public int pesoArbol(Node node) {
        if (node != null) {
            return 1 + pesoArbol(node.getIzquierda()) + pesoArbol(node.getDerecha());
        }
        return 0;
    }

    public void preOrderRecursivo(Node node) {
        if (node != null) {
            System.out.print(node.getContacto() + " - ");
            inorderRecursivo(node.getIzquierda());
            inorderRecursivo(node.getDerecha());

        }
    }

    public void postORderRecursivo(Node node) {
        if (node != null) {
            inorderRecursivo(node.getIzquierda());

            inorderRecursivo(node.getDerecha());
            System.out.print(node.getContacto() + " - ");

        }
    }

    public void printNivel(Node node) {
        if (node != null) {
            System.out.println(node.getContacto());
            printNivel(node.getIzquierda());
            printNivel(node.getDerecha());

        }
    }

    Queue<Node> queue = new LinkedList<>();

    public void breadth(Node root) {
        if (root == null) {
            return;
        }
        queue.clear();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            System.out.print(node.getContacto() + " ");
            if (node.getIzquierda() != null) {
                queue.add(node.getIzquierda());
            }
            if (node.getDerecha() != null) {
                queue.add(node.getDerecha());
            }
        }

    }

    public void printTreeNode(Node root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "|-- " : " |-- ") + root.getContacto());
            printTreeNode(root.getIzquierda(), prefix + (isLeft ? "│   " : "    "), true);
            printTreeNode(root.getDerecha(), prefix + (isLeft ? "│   " : "    "), false);
        }
    }

    public boolean estaEquilibrado() {
        return verificarBalance(raiz);
    }

    private boolean verificarBalance(Node node) {
        if (node == null) {
            return true; //Arbol  vacio, se considera equilibrado
        }

        int alturaIzquierda = obtenerAltura(node.getIzquierda());
        int alturaDerecha = obtenerAltura(node.getDerecha());

        int diferencia = Math.abs(alturaIzquierda - alturaDerecha);
        //verificamos la diferencia de las alturas
        if (diferencia > 1) {
            return false;
        }

        return verificarBalance(node.getIzquierda()) && verificarBalance(node.getDerecha());
    }

    public int obtenerAltura(Node node) {
        if (node == null) {
            return 0;
        }
        int alturaIzquierda = obtenerAltura(node.getIzquierda());
        int alturaDerecha = obtenerAltura(node.getDerecha());

        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }

    //// [Eliminar un nodo]
    public void eliminarContacto(String nombre) {

        raiz = eliminarContactoRec(raiz, nombre);
    }

    public Node eliminarContactoRec(Node nodo, String nombre) {
        // Caso base: si el nodo es nulo, no se puede eliminar
        if (nodo == null) {
            return nodo;
        }

        // Buscar el nodo a eliminar según el nombre del contacto
        if (nombre.compareTo(nodo.getContacto().getNombre()) < 0) {
            // Si el nombre es menor, buscar en el subárbol izquierdo
            nodo.setIzquierda(eliminarContactoRec(nodo.getIzquierda(), nombre));
        } else if (nombre.compareTo(nodo.getContacto().getNombre()) > 0) {
            // Si el nombre es mayor, buscar en el subárbol derecho
            nodo.setDerecha(eliminarContactoRec(nodo.getDerecha(), nombre));
        } else {
            // Si el nombre coincide, este es el nodo a eliminar

            // Caso 1: nodo sin hijos o con un solo hijo
            if (nodo.getIzquierda() == null) {
                return nodo.getDerecha();
            } else if (nodo.getDerecha() == null) {
                return nodo.getIzquierda();
            }

            // Caso 2: nodo con dos hijos
            // Encontrar el nodo sucesor más pequeño en el subárbol derecho o el nodo
            // predecesor más grande en el subárbol izquierdo
            Node sucesor = encontrarMinimo(nodo.getDerecha());
            nodo.setContacto(sucesor.getContacto());

            // Eliminar el sucesor encontrado
            nodo.setDerecha(eliminarContactoRec(nodo.getDerecha(), sucesor.getContacto().getNombre()));
        }

        return nodo;
    }

    private Node encontrarMinimo(Node root) {
        while (root.getIzquierda() != null) {
            root = root.getIzquierda();
        }
        return root;
    }

    public Contacto buscarContacto(String nombre) {
        Node nodoBuscar = buscarRecursivo(raiz, nombre);
        if (nodoBuscar != null) {
            return nodoBuscar.getContacto();
        }
        return null;
    }

    public Node buscarRecursivo(Node nodo, String nombre) {
        // Caso base: si el nodo es nulo, no se puede eliminar
        if (nodo == null) {
            return nodo;
        }
        // Buscar el nodo según el nombre del contacto
        if (nombre.compareTo(nodo.getContacto().getNombre()) < 0) {
            // Si el nombre es menor, buscar en el subárbol izquierdo
            nodo.setIzquierda(buscarRecursivo(nodo.getIzquierda(), nombre));
        } else if (nombre.compareTo(nodo.getContacto().getNombre()) > 0) {
            // Si el nombre es mayor, buscar en el subárbol derecho
            nodo.setDerecha(eliminarContactoRec(nodo.getDerecha(), nombre));
        } else {
            // Si el nombre coincide, este es el nodo que se devuelve
            return nodo;
        }
        return null;

    }

}
