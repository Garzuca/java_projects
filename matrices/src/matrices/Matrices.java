
package matrices;
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        int [][] matTriz = new int [10][10];
        int n;
        n = validaPosi();
        triangularSuperior(matTriz, n);
        System.out.println("--------Matriz superior izquierda--------");
        verMatriz(matTriz, n);
        triangularinferior(matTriz, n);
        System.out.println("--------------la otra matriz-------------");
        verMatriz(matTriz, n);
    }
    
    public static int validaPosi(){
        Scanner entrada = new Scanner(System.in);
        int num;
        do{
            System.out.print("ingrese un numero: ");
            num = entrada.nextInt();
        }while(num<= 0);
        return(num);
    }
    public static void triangularSuperior(int[][] mat ,int num){
        int i;   
        for(i = 0;i <num;i++){ 
            for(int k = 0;k< num;k++){
                if(k <= num -i-1){
                    mat[i][k] = 1;
                }else{
                    mat[i][k] = 0;
                }
            }
        }
    }
    public static void triangularinferior(int [][] mat ,int num){
        int i;
        for(i = 0; i< num;i++){
            for (int k = 0; k < num; k++) {
                if(k >= num -i -1){
                    mat[i][k] = 1;
                }else{
                    mat[i][k] = 0;
                }
            }
        }
    }
    public static  void verMatriz(int [][]mat,int num){
        int i;
        for ( i = 0; i <num; i++) {
            for (int k = 0; k < num; k++) {
                System.out.print(mat[i][k]+ " ");
            }
            System.out.println();
        }
    }
}
