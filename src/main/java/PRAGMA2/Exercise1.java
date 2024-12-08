/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAGMA2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kevin
 */
public class Exercise1 {

    public static void main(String[] args) {

        List<String> subjects = new ArrayList<String>();
        subjects.add("I paid him paid");
        subjects.add("Summertime Sadness");
        List<String> listado = new ArrayList<String>();
        List<String> spam_words = new ArrayList<String>();

        spam_words.add("I");
        spam_words.add("Sadness");
        spam_words.add("paid");


        for (String frase : subjects) {

            String arreglo[] = frase.split(" ");
            int spamCount = 0;
            for (String spamWord : spam_words) {

                for (int i = 0; i < arreglo.length; i++) {
                    if (spamWord.toLowerCase().contains(arreglo[i].toLowerCase())) {
                        spamCount++;
                        //System.out.println("encontró una repetida: frase: " + frase + " , spam: " + spamWord);
                    }
                }

            }
            if (spamCount >= 2) {
                listado.add("spam");
            } else {
                listado.add("no_spam");
            }
        }

        for (String isSpam : listado) {
            System.out.println(isSpam);
        }

        /*
             Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < array.length; i++) {
                if (map.containsKey(array[i])) {
                    map.put(array[i], map.get(array[i]) + 1);
                } else {
                    map.put(array[i], 1);
                }
            }
            
            for (int i = 0; i < array.length; i++) {
                    map.put(array[i], 1);
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry);
            }
            
            for (int k = 0; k < subjects.size(); k++) {
            String array[] = subjects.get(k).split(" ");
            int contador = 0;
            
            
            
            
            for (int i = 0; i < spam_words.size(); i++) {
                
                
                
                for (int j = 0; j < array.length; j++) {
                    if (spam_words.get(i).equalsIgnoreCase(array[j])) {
                        contador++;
                    }
                }
            }

            if (contador >= 2) {
                listado.add("spam");
            } else {
                listado.add("no spam");
            }

        }
        
        for(String palabra : listado){
            System.out.println(palabra);
        }
    
         */
    }
}
