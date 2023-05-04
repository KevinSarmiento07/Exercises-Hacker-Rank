/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public class MinMaxSum {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);
        List<Long> sumas = new ArrayList<>();
        
        
        
        for (int i = 0; i < arr.size(); i++) {
            long acumulado = 0;
            for (int j = 0; j < arr.size(); j++) {
                if(j != i){
                    acumulado += arr.get(j);
                }
            }
            sumas.add(acumulado);
            
        }
        
        
       
        
        
        long max = sumas.get(0), min = sumas.get(0);
        
        for(int i = 0; i < sumas.size() ;i++){
            
            if(max < sumas.get(i) ){
                max = sumas.get(i);
            }
            if(min > sumas.get(i)){
                min = sumas.get(i);
            }
            
        }
        
        
        
        
        System.out.println( min + " " + max );
    }
}
