/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public class DiagonalDifference {

    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> fila1 = new ArrayList<>();
        List<Integer> fila2 = new ArrayList<>();
        List<Integer> fila3 = new ArrayList<>();
        List<Integer> fila4 = new ArrayList<>();

        fila1.add(-1);
        fila1.add(1);
        fila1.add(-7);
        fila1.add(-8);
        fila2.add(-10);
        fila2.add(-8);
        fila2.add(-5);
        fila2.add(-2);
        fila3.add(0);
        fila3.add(9);
        fila3.add(7);
        fila3.add(-1);
        fila4.add(4);
        fila4.add(4);
        fila4.add(-2);
        fila4.add(1);

        arr.add(fila1);
        arr.add(fila2);
        arr.add(fila3);
        arr.add(fila4);

        int sumaIz = 0;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {

                if (i == j) {

                    sumaIz = sumaIz + arr.get(i).get(j);
                    System.out.println(arr.get(i).get(j));
                }
            }
        }
        System.out.println(sumaIz);

        int contador = arr.size() - 1;
        int sumaDer = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = contador; j >= 0; j--) {

                sumaDer += arr.get(i).get(j);
                System.out.println(arr.get(i).get(j));
                contador--;
                break;

            }
        }

        int resultado = Math.abs(sumaIz - sumaDer);

        System.out.println(resultado);

    }

}
