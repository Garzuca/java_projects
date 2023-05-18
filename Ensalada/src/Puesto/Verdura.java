
package Puesto;

public class Verdura extends Cajon{
    private String altura;
    
    public Verdura(String nombre,double precio,String altura){
        
        super(nombre,precio);
        this.altura = altura;
        
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    @Override
    public void info(){
        System.out.println("Verdura: "+nombre+", Tamaño: "+altura+"y su precio es: "+precio);
    }
    
}
