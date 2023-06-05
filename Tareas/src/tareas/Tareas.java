
package tareas;
import java.util.Scanner;

public class Tareas {

    
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        boolean swi = true;
        int op;
        while(swi){
            System.out.println("------Validaciones-------");
            System.out.println("1.validar un numero positivo");
            System.out.println("2.calcular la cantidad de digitos de un numero");
            System.out.println("3.calcular el rango");
            System.out.println("4.verificar si un numero es primo..");
            System.out.println("5.cuadrado perfecto");
            System.out.println("6.divison exacta...");
            System.out.println("7 salir..");
            System.out.print("Elije una opcion.... ");
           op = intro.nextInt();
            int six;
        switch(op){
            case 1:{
                validaPosi();
            }break;
            case 2:{
                cantidadDig();
            }break;
            case 3:{
                rango();
            }break;
            case 4:{
                System.out.println("ingrese el numero a verificar si es primo o no");
                six = intro.nextInt();
                numPrimo(six);
            }
            case 5:{
                System.out.println("Ingrese un numero...");
                int cuadrado = intro.nextInt();
                if(numCuadrado(cuadrado)){
                    System.out.println("Si es cuadrado perfecto...");
                }else{
                    System.out.println("no es cuadrado perfecto...");
                }
            }
            case 6:{
                System.out.println("ingrese el dividendo....");
                int dividendo = intro.nextInt();
                System.out.println("ingrese el divisor...");
                int divisor = intro.nextInt();
                divisible(dividendo, divisor); 
            }
            default:{
                System.out.println("hasta luego...");
                swi = false;
            }break;
        }
        }
    }

   
    public static int validaPosi(){
        //podria colocar los parametros que quiero que reciba pero....
           Scanner entrada = new Scanner(System.in);
           int num;          
           do{
               System.out.println("Ingrese un valor: ");
               num = entrada.nextInt();
           }while(num <=0);
           System.out.println("El numero ingresado es correcto");
           return(num);
           
       } 
    public static void cantidadDig(){
           Scanner entrada = new Scanner(System.in);
           int num;
           System.out.println("Ingrese un numero: ");
           num= entrada.nextInt();
           String numero= String.valueOf(num);
           int cantidad = numero.length();
           System.out.println("la cantidad de digitos es: "+cantidad);
       }
    public static int rango(){
           Scanner rango = new Scanner(System.in);
           int number,op,minU,maxU;
           int min = 0;
           int max =100;
           System.out.println("ingresa tu numero: ");
           number = rango.nextInt();
           System.out.println("elegir rangos 2,rangos automaticos 1");
           op = rango.nextInt();
           if(op == 1){
               System.out.println("lo rangos seran desde 0 hasta 100");
               //esto podria ser un metodo a aparte
               if(number >= min && number <= number){
                   System.out.println("tu numero esta en el rango");
               } else {
                   System.out.println("tu numero no estaba en rango");
               }
               
           }else if(op == 2){
               System.out.println("elige tu rango minimo");
               minU = rango.nextInt();
               System.out.println("u rango maximo es...");
               maxU= rango.nextInt();
               //esto tambien podria ser un metodo aparte
               if(number < maxU && minU > number){
                   System.out.println("tu numero esta en el rango");
               } else {
                   System.out.println("tu numero no estaba en rango");
               }
           }else{
               System.out.println("valor no valido");
           }
           return(number);
           
       }
    public static void numPrimo(int primo){
    boolean primis= true;
        for(int i = 2;i < primo;i++){
            if(primo % 2== 0){
                primis = false;
                break;
            }
            
        }
        if(primis){
            System.out.println("es un numero primo");
        }else{
            System.out.println("no es un numero primo");
        }
    }
    public static boolean numCuadrado(int numero){
           double raiz = Math.sqrt(numero);
           return raiz == (int)raiz;
        
    }
    public static boolean divisible(int numero, int divisor){
        try{
           if(numero % divisor== 0){
               System.out.println("si es divisible..6"
                       + "");
               return true;
           }else{
               System.out.println("no es divisible....");
               return false;
           }
        }catch(ArithmeticException e){
            System.out.println("Error la division no es posible");
            return false;
        }
    }
    }
    
