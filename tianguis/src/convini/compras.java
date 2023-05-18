
package convini;
import java.util.ArrayList;

public class compras {
    protected ArrayList<Producto> productos;
    protected double total;
    
    public compras(){
        this.productos= new ArrayList<>();
        this.total=0;
    }
    
    public void agregar(Producto objeto){
        this.productos.add(objeto);
        this.total+=objeto.precio;
    }
    
    public void quitar(int indice){
        Producto objeto = this.productos.get(indice);
        this.productos.remove(indice);
        this.total-= objeto.precio;
    }
    
    public void mostrar(){
        if(this.productos.size()==0){
            System.out.println("El carrito esta vacio");
        }else{
            System.out.println("carrito de compras");
            for(int i =0;i < this.productos.size();i++){
                System.out.println((i+1)+". "+this.productos.get(i).nombre+"- precio: "+this.productos.get(i).precio);
            }
            System.out.println("Total: "+this.total);
        }
    }
}
