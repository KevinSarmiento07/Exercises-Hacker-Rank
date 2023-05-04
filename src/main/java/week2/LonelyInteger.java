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
public class LonelyInteger {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);

        System.out.println("Hola");
        int numero = 0;
        int unico = 0;
        for (int i = 0; i < a.size(); i++) {
            int contador = 0;
            for (int j = 0; j < a.size(); j++) {

                if (a.get(i) == a.get(j)) {
                    contador++;
                    unico = a.get(i);

                }
            }

            System.out.println(contador + " cont");

            if (contador == 1) {
                numero = unico;
                break;

            }

        }
        System.out.println(numero);

    }

}
