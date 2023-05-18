
package convini;


public class Comida extends Producto{
       protected String tipo,caducidad;
       
       public Comida(String nombre,double precio,String tipo,String caducidad){
           super(nombre,precio);
           this.tipo=tipo;
           this.caducidad=caducidad;
       }
       
       @Override
       public void info(){
           System.out.println("Comida:"+nombre+" precio: "+precio+" tipo: "+tipo+" vence en "+caducidad);
       }
}
