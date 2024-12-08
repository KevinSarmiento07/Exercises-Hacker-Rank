/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kevin
 */
public class PickingNumbers {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(6);
        arr.add(5);
        arr.add(3);
        arr.add(3);
        arr.add(1);


        System.out.println(pickinNumber(arr));
        
        
        

    }
    
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int bajo = 0;
        int alto = 0;
        int maxLen = 0;
        Collections.sort(a);
        while(bajo<=alto && alto < a.size()){
            if(Math.abs(a.get(bajo)-a.get(alto))<=1){
                alto++;
            }
            else{
                int temp = alto-bajo;
                if(temp>maxLen){
                    maxLen = temp;
                }
                bajo++;
            }
        }
        int temp = alto-bajo ;
        
        maxLen = temp>maxLen ? temp : maxLen;
        return maxLen;
    }
    
    public static int pickinNumber(List<Integer> a){
        
        int alto = 0;
        int bajo = 0;
        int maximo = 0;
        
        Collections.sort(a);
        while(bajo <= alto && alto < a.size()){
            
            if(Math.abs( a.get(bajo) - a.get(alto)) <= 1){
                alto++;
            }else{
                int temp = alto - bajo;
                if(temp>maximo){
                    maximo = temp;
                }
                
                bajo++;
            }
            
        }
        
        
        int temp = alto-bajo;
        System.out.println(temp + " " + maximo);
        maximo = temp>maximo? temp: maximo;
        
        return maximo;
    }

}
