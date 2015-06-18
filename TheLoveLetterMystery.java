/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package the.love.letter.mystery;

import java.util.Scanner;

/**
 *
 * @author JANN
 */


public class TheLoveLetterMystery {

    /**
     * @param args the command line arguments
     */
    int T=0; 
    Scanner sc = new Scanner(System.in);
    String palabras[];
    String arrayAux2[] = new String[10];
    String aux="";
    
    public void LeerTeclado(){
        do{
            System.out.println("Numero de Palabras: ");
            T=sc.nextInt();
        }while(T<=1 && T<=10);
    }
    
    public void LeerPalabras(){
        palabras = new String[T];
        for (int i = 0; i < palabras.length; i++) { 
            System.out.println("Palabra "+i+" :");
            palabras[i]=sc.next();
        }
    }
    
    public String InvertirArreglo(String[] palabras){
        for (int i = 0; i < palabras.length; i++) {
            String arrayAux[] = palabras[i].split("");
            for (int j = arrayAux.length; j > 0; j--) {
                arrayAux2[j]=arrayAux[i];
            }
                for (int k = 0; k < arrayAux2.length; k++) {
                   aux=aux.concat(arrayAux2[k]);
                }
                    if (aux == palabras[i]) {
                       return(i+" es "+ 0);
                    }
        }
        return("no llego");
    }
    
    public static void main(String[] args) {
        
        TheLoveLetterMystery Mystery = new TheLoveLetterMystery();
        Mystery.LeerTeclado();
        Mystery.LeerPalabras();
        System.out.println("\n");
        Mystery.InvertirArreglo(Mystery.palabras);
        
                  
    }   
}
