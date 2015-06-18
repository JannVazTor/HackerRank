/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package halloween.party;

import java.util.Scanner;

/**
 *
 * @author JANN
 */
public class HalloweenParty {
    Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public void LeerTeclado(){
        int T = 0;
        
        System.out.println("T: ");//Numero de Iteraciones
        T=sc.nextInt();
        
        long arregloK[] = new long[T];
        long arregloRespuesta[] = new long[T];
        
        System.out.println("\n"+"K: ");
        for (int i = 0; i < T; i++) {
            arregloK[i] = sc.nextLong();
        }
        
        System.out.println("\n"+"Respuesta: ");
        
        for (int i = 0; i < T; i++) {
            if (arregloK[i] % 2 == 0) {
                arregloRespuesta[i] = (long)((arregloK[i]/2)*(arregloK[i]/2));
            }else{
                arregloRespuesta[i] = (long)((arregloK[i]/2) * ((arregloK[i]/2) + 1));
            }
            System.out.println(arregloRespuesta[i]);
        }
    }
    public static void main(String[] args) {
        HalloweenParty hallParty = new HalloweenParty();
        hallParty.LeerTeclado();
    }
}
