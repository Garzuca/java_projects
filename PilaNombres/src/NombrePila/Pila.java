 
package NombrePila;

import javax.swing.JOptionPane;


public class Pila {
    private Nodo ultimo;
    private int tamano;
    public Pila(){
        ultimo = null;
        tamano =0;
    } 
    public boolean estaVacia(){
        return ultimo == null;
    }
    public void apilar(String nombre){
        Nodo nuevoNodo = new Nodo(nombre);
        nuevoNodo.setSiguiente(ultimo);
        ultimo = nuevoNodo;
        tamano++;
    }
    public String desapilar(){
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "La pila esta vacia...");
            return null;
        }else{
            String nombreDesapilar = ultimo.getNombre();
            ultimo = ultimo.getSiguiente();
            tamano--;
            return nombreDesapilar;
        }
    }
    public int obtenerTamano(){
        return tamano;
    }
    public void mostrarPila(){
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "la pila esta vacia..");
        }else{
            String mensaje = "Contenido de la pila : \n";
            Nodo actual = ultimo;
            while(actual != null){
                mensaje+= actual.getNombre() + "\n";
                actual = actual.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}
