
package convini;


public class Ropa extends Producto{
    protected String color;
    protected int talla;
    
    public Ropa(String nombre,double precio,String color,int talla){
        super(nombre,precio);
        this.color=color;
        this.talla=talla;
    }
    @Override
    public void info(){
        System.out.println("nombre: "+nombre+"color: "+color+"talla: "+talla+"precio: "+precio);
    }
}
