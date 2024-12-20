/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kevin
 */
public class MinimumAbsoluteDifferenceInAnArray {
    
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        Collections.sort(arr);
        int diferencia = -1;
        for(int i = 0; i < arr.size() - 1; i++) {
           int auxDif = arr.get(i) - arr.get(i + 1);
           if (auxDif < 0) {
               auxDif = auxDif * -1;
           }
           if (diferencia == -1) {
               diferencia = auxDif;
           } else if (diferencia > auxDif) {
               diferencia = auxDif;
           }
        }
        return diferencia;
    }
    
    public static void main(String[] args) {
        
        System.out.println(minimumAbsoluteDifference(Arrays.asList(-2, 2, 4)));
        //System.out.println(minimumAbsoluteDifference(Arrays.asList(10, 20, 4, 7, 12, -15, 8, 23)));
    }

//int diferencia = -1;
//        for(int i = 0; i < arr.size(); i++) {
//            int auxDiferencia = 0;
//            for (int j = i + 1; j < arr.size(); j++) {
//                auxDiferencia = arr.get(i) - arr.get(j);
//                if (auxDiferencia < 0) {
//                    auxDiferencia = auxDiferencia * -1;
//                }
//                if (diferencia == -1) {
//                    diferencia = auxDiferencia;
//                } else if (diferencia > auxDiferencia) {
//                    diferencia = auxDiferencia;
//                }
//                if (diferencia == 0) {
//                    return 0;
//                }
//                System.out.println("i: " + i + ", j: " + j);
//                System.out.println("diferencia: " + auxDiferencia);
//            }
//        }
//        return diferencia;    
}


