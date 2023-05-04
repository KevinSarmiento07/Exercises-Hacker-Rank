/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author kevin
 */
public class FlippingBits2 {
    
    
    public static long flippingBits(long n) {
    // Write your code here

    
    //https://es.wikibooks.org/wiki/Programaci%C3%B3n_en_Java/Operadores_de_bits
        long num =4294967295L;
        long rnum= ~n;
       return rnum & num;
    }
    public static void main(String[] args) {
        
        //https://es.wikibooks.org/wiki/Programaci%C3%B3n_en_Java/Operadores_de_bits
        long n = 2147483647;
        
        System.out.println(flippingBits(n));
       
    }
    
}
