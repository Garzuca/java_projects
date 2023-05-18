
package convini;


public class Main {
    public static void main(String[] args) {
        //creo los productos
        Producto p1 = new Electrodomestico("Lavadora",599.99,"LG","2000");
        Producto p2 = new Ropa("polera",56.50,"blanco",42);
        Producto p3 = new Comida("biffe",25.60,"personal","20 de noviembre");
        
        
        // cereo el carrito
        
        compras  car = new compras();
        
        //agrego cosas
        
        car.agregar(p1);
        car.agregar(p2);
        car.agregar(p3);
        
        //muestro el carro
        
        car.mostrar();
        
        //mostrar monto total
        
        System.out.println("Total :$"+ car.total);
    }
}
