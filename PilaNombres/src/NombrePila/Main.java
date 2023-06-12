
package NombrePila;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args){
    Pila pila = new Pila();
    int opcion = 0;
    do{
        String input= (JOptionPane.showInputDialog(""
                + "----MENU----- \n"
                + "1.Apilar nombre \n"
                + "2.quitar un nombre \n"
                + "3.Mostrar tamaño de la pila \n"
                + "4.mostrar contenido \n"
                + "5.salir \n\n"));
        if(input == null || input.trim().isEmpty()){
            continue;
        }
        try{
        opcion = Integer.parseInt(input);
        switch(opcion){
            case 1:
                String nombre= JOptionPane.showInputDialog("Ingrese un nombre...");
                pila.apilar(nombre);
                break;
            case 2:
                String quitarNombre=pila.desapilar();
                JOptionPane.showMessageDialog(null, "se quito el nombre de " +quitarNombre);
                break;
            case 3:
                int tamanio = pila.obtenerTamano();
                JOptionPane.showMessageDialog(null, "Tamaño de la pila : "+tamanio);
                break;
            case 4:
                pila.mostrarPila();
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Hasta luego mi estimado...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opvion no valida..");
        }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error ,ingresa una de las opciones..");
        }
        }while(opcion != 5);
    }
}
