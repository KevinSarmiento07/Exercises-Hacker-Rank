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
public class TowerBreakers {
    
    static int towerBreakers(int n, int m) {
        if (n % 2 == 0 || m == 1) {
            return 2;
        } else {
            return 1;
        }
    }
    
    public static void main(String[] args) {
        int numero = towerBreakers(374625, 796723);
        System.out.println(numero);
    }

}
