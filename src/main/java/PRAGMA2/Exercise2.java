/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAGMA2;

/**
 *
 * @author kevin
 */
public class Exercise2 {

    public static void main(String[] args) {
        String input_str = "11001010";//11101010
        int contadorCeros = 0;
        int contadorUnos = 0;

        for (int i = 0; i < input_str.length(); i++) {

            if (input_str.charAt(i) == '0') {

                if (contadorUnos > 0) {
                    contadorUnos--;
                }
                contadorCeros++;
            } else {
                if (contadorCeros > 0) {
                    contadorCeros--;
                }
                contadorUnos++;
            }
        }
        System.out.println(contadorCeros + contadorUnos);

    }

}
