/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author kevin
 */
public class DrawingBook {

    public static void main(String[] args) {
        int n = 50;
        int p = 27;
        
        if (n % 2 == 0 && p % 2 == 1) {
            if ((n - p) < p) {
                System.out.println(((n - p) / 2) + 1);
            } else {
                System.out.println(p / 2);
            }
        }

        if ((n - p) < p) {
            System.out.println(((n - p) / 2) + 1);

        } else {
            System.out.println(p / 2);

        }

    }

}
