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
        boolean next = true;
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = m;
        }
        boolean player = false;
        int i = 0;
        while(i < arr.length && arr[i] > 1) {
            int nuevaAltura = 0;
            for (int divisor = 1; divisor < arr[i]; divisor++) {
                //System.out.println("entro al for interno");
                if (arr[i] > 1 && arr[i] % divisor == 0) {
                    System.out.println("entro al if, num: " + arr[i] + ", divisor: " + divisor);
                    nuevaAltura = divisor;
                }
            }
            if (arr[i] > 1) {
                arr[i] = arr[i] - (arr[i] - 1);
                player = !player;
            } else if (nuevaAltura > 0) {
                //System.out.println("nuevaAltura: " + nuevaAltura);
                arr[i] = nuevaAltura;
                player = !player;
                //System.out.println("playerif: " + player);
            }
           // System.out.println("prueba: " + i + ", " + arr[i]);
           if (arr[i] <= 1) {
               i++;
           }
        }
        
//        for (int j = 0; j < arr.length; j++) {
//            System.out.println("Alturas de torre i: " + j + ", alto: " + arr[j]);
//        }
//        System.out.println("player: " + player);
        return player ? 1 : 2;
    }
    
    public static void main(String[] args) {
        int numero = towerBreakers(374625, 796723);
        System.out.println(numero);
    }

}
