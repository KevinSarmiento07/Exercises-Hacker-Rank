/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Silux.Clases_20Videos;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class NumPrimos {
    
    static boolean nums[] = new boolean [10001];
    
    static ArrayList<Integer> primes = new ArrayList<>();
    
    public static void calculatrPrimes(){
        
        nums[0] = true;
        nums[1] = true;
        
        for(int i = 2 ; i < nums.length; i++){
            
            if(!nums[i]){
                primes.add(i);
                for(int j = i*i; j <= 10000; j+=i){
                    nums[j] = true;
                }
            }
            
        }
        
        
        for(int i = 0; i <= 10000; i++){
            
            if(!nums[i]){
                primes.add(i);
            }
        }
        
        
    }
    
    public static void main(String[] args) {
        calculatrPrimes();
        for(int i = 0; i < primes.size(); i++){
            System.out.println(primes.get(i));
        }
    }
    
}
