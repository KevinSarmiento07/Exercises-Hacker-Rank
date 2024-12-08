package Silux.Clases_20Videos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Clase1 {
    

    public static void main(String[] args) {
        

        /* Queue<String> nombres = new LinkedList<>();

        nombres.add("Kevin");
        nombres.add("Alejandra");
        nombres.add("Edwin");
        nombres.add("Leonardo");

        System.out.println(nombres);
        System.out.println(nombres.peek());
        System.out.println(nombres); */


        /* System.out.println(mcd(mcd(20, 15), 40));
        System.out.println(mcm(10, 20));
 */

        System.out.println(fibonacci(3));

    }


    public static int fibonacci(int n){

        if(n == 1 || n == 0){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


    public static int mcm(int a , int b){




        return (a*b)/mcd(a, b);
    }



    public static int mcd(int a, int b){
        //int contador = 0;
        while(b!= 0){
            
            int aux;
            //System.out.println("contador: " + contador++  + "a: " +  a  + ", b: " + b);
            a %= b;
            //System.out.println("a: " +  a  + ", b: " + b);
            aux = a;
            a = b;
            b = aux;
            //System.out.println("a: " +  a  + ", b: " + b);
        }

        return a;
    }


}
