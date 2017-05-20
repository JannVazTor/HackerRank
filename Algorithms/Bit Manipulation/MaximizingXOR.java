/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maximizing_xor;

import java.util.Scanner;

/**
 *
 * @author JANN
 */


public class Maximizing_XOR {

    Scanner sc;
    int L=0,R=0;
      
    public void LeerTeclado(){
        sc = new Scanner(System.in);
//        do{
            System.out.print("L :");
            L=sc.nextInt();
            System.out.print("\n"+"R :");
            R=sc.nextInt();
//        }while(L>=1 && R>=L && R<=1000);
    }
    
    public int XORmayor(int L,int R){
        int C=0,mayor=0,A=0,B=0;
        int arrayResultadoXOR[]=new int[1000000];
        A=L;
        B=L;
        for (int i = 0; A!=R; i++) {
            if (i==0) {
                C=A^B;
                arrayResultadoXOR[i]=C;
            }else{
                if (B==R){
                    A+=1;
                    B=A;
                    C=A^B;
                    arrayResultadoXOR[i]=C;
                }else{
                    B+=1;
                    C=A^B;
                    arrayResultadoXOR[i]=C;
                }   
            }
        }
        mayor=arrayResultadoXOR[0];
        for (int i = 0; i < arrayResultadoXOR.length; i++) {
            if (arrayResultadoXOR[i]>mayor) {
                mayor=arrayResultadoXOR[i];
            }
        }
        return(mayor);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Maximizing_XOR maxXOR = new Maximizing_XOR();
        maxXOR.LeerTeclado();
        System.out.println("\n"+"El XOR Mayor es:"+maxXOR.XORmayor(maxXOR.L,maxXOR.R));
    }
}
