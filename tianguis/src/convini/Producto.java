
package convini;


public class Producto {
    protected String nombre;
    protected double precio;
    
    public Producto(String nombre, double precio){
        this.nombre=nombre;
        this.precio = precio;
    }
     public void info(){
         System.out.println("nombre : "+nombre+"precio "+precio);
     }
}
