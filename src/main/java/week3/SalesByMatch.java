/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author kevin
 */
public class SalesByMatch {
    
    public static void main(String[] args) {
        
        
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);
        
        
        int n = ar.size();
        System.out.println("n: "  + n);
        
        
        Collections.sort(ar);
        int contador = 0;
        for(int i = 0; i < n - 1; i++){
            System.out.println("entro");
            
            if(ar.get(i) == ar.get(i+1)){
                
                i++;
                contador++;
            }
            
        }
        
        System.out.println("contdor:"+  contador);

    }
    
}
