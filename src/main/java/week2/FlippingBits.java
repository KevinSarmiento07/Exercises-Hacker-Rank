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
public class FlippingBits {
    
    public static void main(String[] args) {
        
        int n = 0;
        
        long n2 = 4294967295L;
        System.out.println(n2);
        String cadena = String.valueOf(n);
        
        System.out.println(cadena);
        
        String inverso ="";
        
        for(int i = 0 ; i < cadena.length(); i++){
            
            if(cadena.charAt(i) == '1'){
                 inverso +=  "0";
            }else{
                inverso += "1";
            }
        }
        
        n = Integer.parseInt(inverso);
        System.out.println("n:" + n);
        long suma = 0;
        int contador = 0;
        for(int i = 0; i < inverso.length(); i++){
             
            if(n % 10 == 1){
                System.out.println("Entro al if");
                suma += Math.pow(2, contador);
                
            }
            n = n/10;
            contador++;
            
            
        }
        
        System.out.println(suma);
        System.out.println(inverso);
        
    }
    
}
