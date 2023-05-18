
package Puesto;


public class Main {
    public static void main(String[] args) {
      
        Cajon mensajero1 = new Fruta("Banana",5.40,"amarillo");
        Cajon mensajero2 = new Verdura("papa",10.00,"pequeña");
      
        mostrar(mensajero2);
        mostrar(mensajero1);
    }
    public static void mostrar(Cajon producto){
            producto.info();
        }
}
