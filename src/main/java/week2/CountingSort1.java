/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kevin
 */
public class CountingSort1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(1);

        
        
        
        List<Integer> count = new ArrayList<>(Collections.nCopies(100, 0));
        
        for(int i = 0; i < arr.size(); i++){
            int valorActual = arr.get(i);
            int valorAnterior = count.get(valorActual);
            
            
            
            count.set(valorActual, valorAnterior+1);
        }
        
        for(int i = 0 ; i < count.size(); i++){
        
            
            System.out.println(count.get(i) + " - ");
        }
        
        
        /*OPCION 2 MIA
         int aux2[] = new int[100];
    
         List<Integer> aux = new ArrayList<>();
    
        
        for(int i = 0; i < arr.size(); i++){
            aux2[arr.get(i)]++;
        }
        
        for(int i = 0; i < 100; i++){
            aux.add(aux2[i]);
        }
        
        return aux;*/
    }
    
}
