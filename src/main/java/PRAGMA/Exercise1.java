/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAGMA;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public class Exercise1 {
    public static void main(String[] args) {
        List<Long> arr = new ArrayList<>();
        
        arr.add(2L);
        arr.add(1L);
        arr.add(3L);
       

        List<Long> aux = new ArrayList<>();
        aux.add(0L);
        
        for(int i = 1 ; i <  arr.size(); i++){
            long contador = 0;
            
               
            
                for(int j = 0; j < i ; j++){
                    contador += (arr.get(i) - arr.get(j));
                }
                
            
            aux.add(contador);
        }
        
      
        
        
        
        for(int i = 0; i < aux.size(); i++){
            System.out.println(aux.get(i));
        }
        
        
    }
    
}
