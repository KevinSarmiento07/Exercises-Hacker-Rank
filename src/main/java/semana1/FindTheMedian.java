/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author kevin
 */
public class FindTheMedian {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(6);

        int aux = 0;
        int suma = 0;

        Collections.sort(arr);

        for (Integer numero : arr) {
            suma += numero;
        }

        int medio = 0;
        medio = arr.size()/2;

        System.out.println(medio);

    }
}
