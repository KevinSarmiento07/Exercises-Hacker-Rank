/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author kevin
 */
public class Anagram {
    
    public static int anagram(String s) {
    // Write your code here
        if (s.length() % 2 != 0) {
            return -1;
        }
        String s1 = s.substring(0, (s.length() / 2));
        String s2 = s.substring((s.length() / 2), s.length());
        System.out.println(s1);
        System.out.println(s2);
        List<Character> cadena1 = s1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> cadena2 = s2.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        
//        for(int i = 0; i < cadena1.size(); i++) {
//            char letra = s1.charAt(i);
//            System.out.println("LETRA: " + letra);
//            for(int j = 0; j < cadena2.size(); j++) {
//                char letraComparar = s2.charAt(j);
//                System.out.println("LETRAC: " + letraComparar);
//                if (letra == letraComparar) {
//                    System.out.println("ENTRO");
//                    System.out.println(cadena2.get(j));
//                    cadena2.remove(j-1);
//                    break;
//                }
//            }
//        }
        for(int i = 0; i < s1.length(); i++) {
            char letra = s1.charAt(i);
            System.out.println("LETRA: " + letra);
            for(int j = 0; j < s2.length(); j++) {
                char letraComparar = s2.charAt(j);
                System.out.println("LETRAC: " + letraComparar);
                if (letra == letraComparar) {
                    System.out.println("s2a: " + s2);
                    s2 = s2.substring(0, j) + s2.substring(j + 1);
                    System.out.println("s2d: " + s2);
                    break;
                }
            }
        }
        return s2.length();
    }
    
    public static void main(String[] args) {
        System.out.println(anagram("asdfjoieufoa"));
    }
    
}
