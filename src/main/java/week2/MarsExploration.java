/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.nio.charset.StandardCharsets;

/**
 *
 * @author kevin
 */
public class MarsExploration {
    
    public static void main(String[] args) {
        
        String s = "SOSSOT";
        byte letras[] = s.getBytes(StandardCharsets.US_ASCII);
    int contador = 0;
    
    char arr[] = {'S', 'O', 'S'};
    for(int i = 0; i < letras.length; i++){
        
        if(letras[i] != 83 && letras[i] != 79){
          
        }
    }
    
    int aux = 0;
    for(int i = 0; i < letras.length; i++){
        
        if(aux == 3){
            aux = 0;
        }
        if(arr[aux] != s.charAt(i)){
            contador++;
        }
        aux++;
    }
    
    
    System.out.println(contador);
    }
    
}
