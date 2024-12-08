/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Silux.Clases_20Videos;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Grafos {
    
    
    static int v, e;
    
    static int MAX = 1000;
    static int ady[][] = new int [MAX][MAX];
    
    
    public static void main(String[] args) {
        
        int v, e, origen,destino;
        
        Scanner s = new Scanner(System.in);
        
        v = s.nextInt();
        e = s.nextInt();
        
        
        while(e > 0){
            origen = s.nextInt();
            destino = s.nextInt();
            
            
            ady[origen][destino] = 1;
            ady[destino][origen] = 1;
            
            e--;
        }
    }
    
    
}
