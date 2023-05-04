/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class PlusMinus {
    
    
    
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        //-4 3 -9 0 4 1
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
         int contCero = 0, contPos = 0, contNeg = 0;
        
        DecimalFormat formato1 = new DecimalFormat("#.######");
        
        int arrSize = arr.size();
        double resultadoPos =0, resultadoNeg = 0, resultadoCero = 0;
        
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
            if(arr.get(i) == 0 ){
                contCero++;
                
            }else if(arr.get(i) > 0){
                contPos++;
            }else{
                contNeg++;
            }
            
        }
        
        
        resultadoPos = (double) contPos/arrSize;
        resultadoNeg = (double)contNeg/arrSize;
        resultadoCero = (double) contCero/arrSize;
        System.out.println(formato1.format(resultadoPos));
        System.out.println(formato1.format(resultadoNeg));
        System.out.println(formato1.format(resultadoCero));
        
        
        
       
    }
}
