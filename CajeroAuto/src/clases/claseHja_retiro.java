
package clases;


public class claseHja_retiro extends padre_abs{
    @Override
    public void Transaccion(){
        System.out.print("Cuanto deseas retirar: ");
        Retiro();
        if(retiro <= getSaldo()){
            transas = getSaldo();
            setSaldo(transas -retiro);
            System.out.println("-----------------------------------");
            System.out.println("Tu retiro fue de: "+retiro);
            System.out.println("Tu saldo acutal es: "+getSaldo());
            System.out.println("-----------------------------------");
        }else{
            System.out.println("-------------------------");
            System.out.println("Saldo insuficiente....");
            System.out.println("-------------------------");
        }
    }
    
}
