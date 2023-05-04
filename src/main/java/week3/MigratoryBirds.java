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
public class MigratoryBirds {
    
    public static void main(String[] args) {
        
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        
        
        
        Collections.sort(arr);
        
        int aux[] = new int[6];
        
        for(int i = 0; i < arr.size(); i++){
            
            aux[arr.get(i)]++;
            
        }
        
        
        int max = 0;
        int p =0;
        for(int i = 0; i < 6 ; i++){
            
            if(max < aux[i]){
                max = aux[i];
                p = i;
            }
        }
        
        System.out.println(p);
        
        
    }
}
