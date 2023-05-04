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
public class PermutingTwoArrays {
    
    public static void main(String[] args) {
        
        
        
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        
        A.add(5);
        A.add(10);
        A.add(2);
        A.add(4);
        A.add(1);
        A.add(6);
        A.add(3);
        A.add(7);
        A.add(9);
        
        B.add(1);
        B.add(4);
        B.add(8);
        B.add(3);
        B.add(9);
        B.add(0);
        B.add(2);
        B.add(5);
        B.add(6);
        B.add(7);
        
        int n = A.size();
        
        A.sort((a, b) -> a.compareTo(b));
        Collections.sort(B, Collections.reverseOrder()); 
       
        int k = 10;
        
        String rt = "";
        for(int i = 0; i < n ; i++){
            
            if((A.get(i) + B.get(i) >= k)){
                rt = "YES";
            }else{
                rt = "NO";
                break;
            }
        }
        
        
        System.out.println(rt);


        
        
    }
    
}
