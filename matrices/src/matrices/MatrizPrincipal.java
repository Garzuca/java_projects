
package matrices;
import java.util.Scanner;

public class MatrizPrincipal {
    public static void main(String[] args) {
        int [][] mat = new int[10][10];
        int numero;
        numero = validaPosi();
        triangularSup(mat, numero);
        System.out.println("------MATRIZ TRIANGULAR SUPERIOR--------");
        verMatriz(mat, numero);
        triangularInf(mat, numero);
        System.out.println("-----MATRIZ TRIANGULAR INFERIOR---------");
        verMatriz(mat, numero);
    }
   public static int validaPosi(){
       Scanner entrada = new Scanner(System.in);
       int num;
       do{
           System.out.println("ingrese pa dimension dela matriz...");
           num = entrada.nextInt();
       }while(num <= 0);
       return (num);
   }
   public static void triangularSup(int [][] mat,int num){
       int i ;
       for (i = 0; i < num; i++) {
           for (int j = 0; j < num; j++) {
               if (i <= j) {
                   mat[i][j]= 1;
               } else {
                   mat[i][j]= 0;
               }
           }
       }
   }
   public static void triangularInf(int [][] mat,int num){
       for (int i = 0; i < num; i++) {
           for (int j = 0; j < num; j++) {
               if (i >= j) {
                   mat[i][j]= 1;
               } else {
                   mat[i][j] = 0;
               }
           }
       }
   }
   public static void verMatriz(int [][] mat,int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                   System.out.print(mat[i][j] +" ");
            }
            System.out.println();
       }
   }
}
