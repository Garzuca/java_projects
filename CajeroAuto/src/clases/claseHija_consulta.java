
package clases;


        
public class claseHija_consulta extends padre_abs{
    @Override
    public void Transaccion(){
        System.out.println("------------------------------");
        System.out.println("Tu salod actual es: "+getSaldo());
        System.out.println("------------------------------");
    }
}
