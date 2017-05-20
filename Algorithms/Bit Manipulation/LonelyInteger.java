/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lonely.integer;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author JANN
 */
public class LonelyInteger {

    /**
     * @param args the command line arguments
     */
    static int lonelyinteger(int[] a) {
        int resultado=0;
        boolean [] bandera = new boolean[a.length];
        if (a.length == 1) {
            return a[0];
        }else{
            for (int i = 1; i < a.length-1; i++) {
                if(bandera[i]==true)continue;
                for (int j = 0; j < a.length; j++) {
                    if(bandera[j]==true)continue;
                    if (a[j]==a[i] && j!=i) {
                        bandera[j]=true;
                        bandera[i]=true;
                    }
                }
            }
            for (int i = 0; i < a.length; i++) {
                if (bandera[i]==false) {
                    resultado = a[i];
                }
            }
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        System.out.println("Tamaño del Arreglo: ");
        int n = Integer.parseInt(in.nextLine());
        
        int[] _a = new int[n];
        int _a_item;
        
        System.out.println("\n"+"Elementos del Arreglo(Deven separarse por espacios): ");
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int i = 0; i < n; i++) {
            _a_item = Integer.parseInt(next_split[i]);
            _a[i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println("\n"+"Resultado: " + res);
    }
}
