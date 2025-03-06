/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kevin
 */
public class MaxMin {
    
    public static void main(String[] args) {
        
        List<Integer> arr = Arrays.asList(100, 200, 300, 350, 400, 401, 402);
        int k = 3;
        Collections.sort(arr);
        int numMenor = Integer.MAX_VALUE;
        for(int i = 0; i <= arr.size() - k; i++ ){
           int num = arr.get(k + i - 1) - arr.get(i);
           if (num < numMenor){
            numMenor = num;
           }
        }
        System.out.println(numMenor);
    }
    
}
