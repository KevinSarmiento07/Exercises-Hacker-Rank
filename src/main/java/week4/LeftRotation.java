/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public class LeftRotation {
    
    public static void main(String[] args) {
        
        List<Integer> arr = new ArrayList<>();
        
       arr.add(1);
       arr.add(2);
       arr.add(3);
       arr.add(4);
       arr.add(5);
       
        System.out.println(leftRotation(4, arr));
        
    }
    
    
    
    public static List<Integer> leftRotation(int d, List<Integer> arr){
        
        for(int i = 0; i < d; i++){
            
            int temp = arr.get(0);
            
            arr.remove(0);
            arr.add(temp);
            
        }
        
        
        return arr;
    }
    
}
