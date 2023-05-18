
package convini;


public class Electrodomestico extends Producto{
    protected String marca,modelo;
    public Electrodomestico(String nombre,double precio,String marca,String modelo){
        super(nombre,precio);
        this.marca=marca;
        this.modelo=modelo;
        
    }
    
    @Override
    public void info(){
        System.out.println("nombre: "+nombre+"marca: "+marca +" modelo: "+modelo+"precio "+precio);
    }
}
