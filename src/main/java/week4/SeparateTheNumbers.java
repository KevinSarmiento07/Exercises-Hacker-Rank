/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author kevin
 */
public class SeparateTheNumbers {

    public static void separateNumbers(String s) {
        for (int i = 1; i < (s.length() + 4) / 2; i++) {
            StringBuilder sb = new StringBuilder(s.substring(0, i));
            Integer num = Integer.parseInt(sb.toString());
            Integer firstNumber = num;
            while (sb.length() < s.length()) {
                sb.append("" + ++num);
                System.out.println(sb);
            }
            if (sb.toString().equals(s)) {
                System.out.println("YES " + firstNumber);
                return;
            }
            //System.out.println(num);
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {

        separateNumbers("99100");

    }

}
