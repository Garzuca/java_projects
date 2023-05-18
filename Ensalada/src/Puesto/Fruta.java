
package Puesto;


public class Fruta extends Cajon{
    private String color;
    public Fruta(String nombre,double precio,String color){
        super(nombre, precio);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //sobreescribo info (poliformismo)
    @Override
    public void info(){
        System.out.println("Fruta: "+nombre+", color: "+color+"y su precio es: "+precio);
    }
    
}
