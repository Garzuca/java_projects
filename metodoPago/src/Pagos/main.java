
package Pagos;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        pagoEfectivo mensajero = new pagoEfectivo(5000,0);
        System.out.println("ingrese cuanto es el monto a pagar en efectivo: ");
        Scanner entrada = new Scanner(System.in);
        int cash = entrada.nextInt();
        mensajero.efectivo(cash);
        
       }
}
