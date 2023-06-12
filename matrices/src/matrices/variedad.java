
package matrices;
import  matrices.MatrizPrincipal;
import java.util.Scanner;

public class variedad {
    public static void main(String[] args) {
    //importo el metodo validaPosi() desde la otra clase
    //hare lo mismo con verMatriz
    int n;
    boolean[][] mat = new boolean[10][10];
    n = MatrizPrincipal.validaPosi();
        generaBool(mat, n);
        System.out.println("-----MATRIZ BOOLEANA-------");
        //aqui no importa ya que en la otra clase uso una matriz d interos yaqui uso na matriz booleana
        MatrizPrincipal.verMatriz(mat, n);
    }
    public static void generaBool(boolean [][] mat,int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j) {
                    mat[i][j] = true;
                } else {
                    mat[i][j] = false;
                }
            }
        }
  
    }
}
