
package clases;


public class classeHija_deposito extends padre_abs{
    @Override
    public void Transaccion(){
        System.out.println("Cuanto vas a depositar....");
        Deposito();
        transas = getSaldo();
        setSaldo(transas + deposito);
        System.out.println("---------------------------------");
        System.out.println("depositaste : "+deposito);
        System.out.println("tu saldo actual es "+ getSaldo());
        System.out.println("---------------------------------");
    }
}
