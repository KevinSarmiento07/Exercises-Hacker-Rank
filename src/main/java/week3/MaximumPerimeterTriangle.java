/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kevin
 */
public class MaximumPerimeterTriangle {

    public static void main(String[] args) {
        
        ArrayList<Integer> sticks = new ArrayList<>();
        sticks.add(1);
        sticks.add(1);
        sticks.add(1);
        sticks.add(3);
        sticks.add(3);

    Collections.sort(sticks, Collections.reverseOrder());
    List<Integer> aux = new ArrayList<>();
    for(int i = 0; i <= sticks.size()-3; i++){
        
        int a = sticks.get(i + 2);
        int b = sticks.get(i + 1);
        int c = sticks.get(i);
        
        if( (a + b) > c){
            aux.add(a);
            aux.add(b);
            aux.add(c);
            //return aux;
        }
        //return new List<int>() {a, b, c};
        
        
    }
    
    
        aux.add(-1);
        //return aux;
        
        
    }
}
