/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Silux.Clases_20Videos;

/**
 *
 * @author kevin
 */
public class CoeficienteBinomial {


    public static long binomialCoefficient(long n, long k){
        
        if(k < 0 || n < k){
            return 0;
        }
        
        
        long numero = Math.min(k, n-k);
        long resultado = 1;
        k = 1;
        for(int i = 0; i < numero; i++){
            
            resultado *= n/k;
            n--;
            k++;
            
        }
        
        return resultado;
    }
    
    public static long binomialCoefficientVideo(long n, long k){
        
        if(k < 0 || n < k){
            return 0;
        }
        k = Math.min(k, n-k);
        
        long rta = 1;
        for(int i = 1; i <= k; i++){
            
            rta *= (n - i + 1)/i;
            
        }
        
        return rta;
    }
    
    public static void main(String[] args) {
        
        
        System.out.println(binomialCoefficient(5, 3));
    }
    
}
