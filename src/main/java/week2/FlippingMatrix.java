/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class FlippingMatrix {
    public static void main(String[] args) {
        
        
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        arr.add(1);
        arr.add(2);
        arr2.add(3);
        arr2.add(4);
        
        matriz.add(arr);
        matriz.add(arr2);
        
        
        for(int i = 0; i < matriz.size(); i++){
            for(int j = 0; j < matriz.size() ; j++){
               
                
                
            }
           
        }
        
        int maximo = 0;
        int maximo2 = 0;
        int suma = 0;
        int q = 1;
        int n = matriz.size();
        
        
        for (int i = 0; i < matriz.size()/2; i++) {
            for(int j = 0; j < matriz.size()/2; j++){
                maximo += Math.max(matriz.get(i).get(j), matriz.get(i).get(n-j-1) );
                maximo2 += Math.max(matriz.get(n-i-1).get(j), matriz.get(n-i-1).get(n-j-1));
                
                if(maximo > maximo2){
                    suma += maximo;
                }else{
                    suma += maximo2;
                }
            }
            System.out.println(suma + ":");
        }
        
        
        
        System.out.println(suma);
        
        int contador = 0;
        
        
        
        
        
        
        
        
    }
}
