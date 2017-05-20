/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finddigits.hackerrank;

import java.util.Scanner;

/**
 *
 * @author JANN
 */
public class FindDigitsHackerRank {
    Scanner sc = new Scanner(System.in);
    
    public void leer(){
        int N=0, T=0, auxnum=0, contador=0, aux3 = 0;;
        String aux = "";
        char caracter;
        System.out.println("T: ");
        T=sc.nextInt();
        
        int[] resultado = new int[T];
        
        for (int i = 0; i < T; i++) {
            System.out.println("N: ");
            N=sc.nextInt();
            aux = Integer.toString(N);
            for (int j = 0; j < aux.length(); j++) {
                caracter = aux.charAt(j);
                auxnum = Character.getNumericValue(caracter);
                if (auxnum == 0) {
                    continue;
                }else{
                    if (N % auxnum  == 0) {
                        contador++;
                    }
                }
            }
            resultado[i] = contador;
            contador=0;
        }
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("resultado: " + resultado[i]);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FindDigitsHackerRank fd = new FindDigitsHackerRank();
        fd.leer();
    }
}
