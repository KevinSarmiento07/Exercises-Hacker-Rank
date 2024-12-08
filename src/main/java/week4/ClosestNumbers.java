/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kevin
 */
public class ClosestNumbers {
    
    
    public static List<Integer> closestNumbers(List<Integer> arr) {
        //Hecho solo
        List<Integer> pairs = new ArrayList<>();
        Collections.sort(arr);
        int menorDiferencia = arr.get(1) - arr.get(0);
        for(int i = 0; i < arr.size() - 1; i++) {
            if ((arr.get(i+1) - arr.get(i)) < menorDiferencia) {
                menorDiferencia = arr.get(i+1) - arr.get(i);
            }
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i+1) - arr.get(i) == menorDiferencia) {
                pairs.add(arr.get(i));
                pairs.add(arr.get(i+1));
            }
        }
        //System.out.println("menorD: " + menorDiferencia);
        //arr.stream().forEach(System.out::println);
        return pairs;
    }
    
    public static void main(String[] args) {
        List<Integer> list = closestNumbers(Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854));
        list.stream().forEach(System.out::print);
    }
}
