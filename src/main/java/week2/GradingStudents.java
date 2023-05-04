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
public class GradingStudents {

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        List<Integer> resultado = new ArrayList<>();

        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        int numero = 0;

        for (int i = 0; i < grades.size(); i++) {

            numero = (100 - grades.get(i)) % 10;

            System.out.println(numero + "numero");
            if (grades.get(i) < 38) {
                resultado.add(grades.get(i));
            } else if ((grades.get(i) + numero) - grades.get(i) < 3 && numero < 5) {
                resultado.add(grades.get(i) + numero);
            } else if(numero < 8 && numero > 5){
                
                resultado.add((grades.get(i)+ numero) -5);
            }else{
                resultado.add(grades.get(i));
            }

        }
        
        for(Integer rs : resultado){
            System.out.println(rs);
        }
    }
}
