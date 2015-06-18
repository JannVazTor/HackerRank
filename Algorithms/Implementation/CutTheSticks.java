
package cut.the.sticks;

import java.util.Scanner;

/**
 *
 * @author JANN
 */
public class CutTheSticks {
    Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public void LeerDatos(){
        int N = 0,contador = 0;
        int numeroMenor = 999;
        
        System.out.println("N: ");
        N = sc.nextInt();
        
        int numerosPalos[] = new int[N];
        int numeroCortes[] = new int[N];
      
        for (int i = 0; i < N; i++) {
            System.out.println("Valor "+"["+i+"]"+" : ");
            numerosPalos[i] = sc.nextInt();
        }
        for(int j=0; j < numeroCortes.length; j+=1){
            contador = 0;
            numeroMenor = 999;
            for (int i = 0; i < numerosPalos.length; i++) {
                if (numeroMenor > numerosPalos[i] && numerosPalos[i] != 0) {
                    numeroMenor = numerosPalos[i];
                }
            }
            for (int i = 0; i < N; i++) {
                if (numerosPalos[i]==0) {
                    continue;
                }else{
                    numerosPalos[i] = numerosPalos[i]-numeroMenor;
                    contador++;
                }
            }
            numeroCortes[j] = contador;
        }
        for (int i = 0; i < numeroCortes.length; i++) {
            if (numeroCortes[i] == 0) {
                continue;
            }else{
                System.out.println(numeroCortes[i]);
            }
        }
    }
    public static void main(String[] args) {
        CutTheSticks cts = new CutTheSticks();
        cts.LeerDatos();
    }
}
