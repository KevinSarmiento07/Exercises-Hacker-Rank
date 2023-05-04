/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public class BreakingTheRecords {

    public static void main(String[] args) {

        List<Integer> scores = new ArrayList<>();

        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);

        int contMax = 0, contMin = 0;
        int valorMayor = scores.get(0), valorMenor = scores.get(0);

        for (int i = 0; i < scores.size() - 1; i++) {

            if (valorMayor < scores.get(i + 1)) {
                
                contMax++;
                valorMayor = scores.get(i+1);
            } else if (valorMenor > scores.get(i + 1)) {
                contMin++;
                valorMenor = scores.get(i+1);
            }
        }

        List<Integer> contadores = new ArrayList<>();

        contadores.add(contMax);
        contadores.add(contMin);

        for (int i = 0; i < contadores.size(); i++) {

            System.out.println(contadores.get(i));

        }

    }

}
