package clases;

import java.util.Scanner;

public abstract class padre_abs {

    protected int transas, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int elige = 0;
        do{
        do {
            System.out.println("por favor elige un opcion");
            System.out.println("    1.consultar saldo: ");
            System.out.println("    2.retiros: ");
            System.out.println("    3.depositos: ");
            System.out.println("    4.salir");
            elige = entrada.nextInt();
            if (elige <= 1 && elige <= 4) {
                bandera = 1;
            } else {
                System.out.println("-----------------------");
                System.out.println("opcion no disponible...");
                System.out.println("-----------------------");
            }
        } while (bandera == 0);
        
        if(elige == 1){
            padre_abs mensaje = new claseHija_consulta();
            mensaje.Transaccion();
        }else if(elige == 2){
            padre_abs mensaje = new claseHja_retiro();
            mensaje.Transaccion();
        }else if(elige == 3){
            padre_abs mensaje = new classeHija_deposito();
            mensaje.Transaccion();
        }else if(elige == 4){
            System.out.println("------------------------");
            System.out.println("Gracias, vuelva pronto.");
            System.out.println("------------------------");
            bandera  = 2;
        }
        }while(bandera != 2);
    }
    
    //cantidad de retiro metodo
    public void Retiro(){
        retiro = entrada.nextInt();
        
    }
    
    //solicitar deposito metodo
    public void Deposito(){
        deposito = entrada.nextInt();
        
    }
    //metodo abstracto
    public abstract void Transaccion();
    //metodod set y get
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int dinero){
        this.saldo = dinero;
    }
}
