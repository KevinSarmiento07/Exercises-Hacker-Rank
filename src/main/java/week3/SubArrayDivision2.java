/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public class SubArrayDivision2 {
    public static void main(String[] args) {
        
        
        List<Integer> s  = new ArrayList<>();
        s.add(2);
        s.add(5);
        s.add(1);
        s.add(3);
        s.add(4);
        s.add(4);
        s.add(3);
        s.add(5);
        s.add(1);
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(4);
        s.add(1);
        s.add(3);
        s.add(3);
        s.add(4);
        s.add(2);
        s.add(1);
        //2 5 1 3 4 4 3 5 1 1 2 1 4 1 3 3 4 2 1
        
        int d = 18, m = 7;
        
        int contador = 0;

        for(int i = 0; i <= s.size()-m; i++){
            int suma = 0;
            
            
            for(int j = 0; j < m; j++){
                
                suma += s.get(i+j);
            }
            
            if(suma == d){
                contador++;
            }
            
        }
        
        System.out.println(contador);
  
        
    }
    
}
