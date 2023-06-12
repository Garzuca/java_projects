
package Pagos;
import java.util.Scanner;
//
public class pagoEfectivo implements metodosPago{
    private int dinero;
    private int monto;
    public pagoEfectivo(int dinero,int monto){
        this.dinero = dinero;
        this.monto = monto;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    @Override
    public int efectivo(int cash){
        
        if(cash <= dinero){
            System.out.println("tu saldo actual es: "+dinero);
            monto=dinero - cash;
            System.out.println("tu saldo actual tras el retiro es : " +monto);
        }else{
            System.out.println("error en la matrix");
        }
        return(monto);
    }
    @Override
    public void deuda(){
        
    }
    @Override
    public int tarjeta(int can){
        return 0;
    }
}
