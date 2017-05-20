/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utopian.tree;

import java.util.Scanner;

/**
 *
 * @author JANN
 */
public class UtopianTree {
    
    public int resultado(int n){
        int aux1=1;
        if (n==0) {
            return (aux1);
        }else{
            for(int i=1;i<n+1;i++){
                if (i%2!=0 && i!=1) {
                    aux1*=2;
                    continue;
                }
                aux1+=1;
            }
            return (aux1);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        UtopianTree rs = new UtopianTree();
        
            int t=0;
            int n=0;
            int res=0;
        do {
            System.out.println("Valor de T:");
            t = sc.nextInt();
        }while(t<=1 && t<=10);
            for(int i=0;i<t;i++){
                do{
                    System.out.println("\n"+"Valor de N:");
                    n = sc.nextInt();
                }while(n<0 && n<=60);
                System.out.println("\n"+"Resultado: "+rs.resultado(n)+"\n");
            }
    }
}
