
package Puesto;


public class Cajon {
   protected String nombre;
   protected double precio;
   
   public Cajon(String nombre,double precio){
       this.nombre = nombre;
       this.precio = precio;
   }
    
    public void info(){
        System.out.println("Producto: "+nombre+",y su precio es: "+precio);
    }
   
}
