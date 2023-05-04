/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class CamelCase {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            String currInput = in.nextLine();
//            int size = currInput.length();
//            String toPrint = "";
//            int i = 4; //char to start at
//
//            if (currInput.charAt(0) == 'S') { //Split
//                if (currInput.charAt(2) == 'M') { //Method
//                    while (i < size - 2) { //skip the method's ()
//                        if (Character.isUpperCase(currInput.charAt(i))) {
//                            toPrint += " ";
//                        }
//                        toPrint += currInput.charAt(i);
//                        i++;
//                    }
//                } else { //Class or Variable
//                    while (i < size) {
//                        if (Character.isUpperCase(currInput.charAt(i)) && i > 4) {
//                            toPrint += " ";
//                        }
//                        toPrint += currInput.charAt(i);
//                        i++;
//                    }
//                }
//                toPrint = toPrint.toLowerCase();
//            } else { //Combine
//                if (currInput.charAt(2) == 'M') { //Method
//                    while (i < size) {
//                        if (currInput.charAt(i) == ' ') {
//                            i++;
//                            toPrint += Character.toUpperCase(currInput.charAt(i));
//                        } else {
//                            toPrint += currInput.charAt(i);
//                        }
//                        i++;
//                    }
//                    toPrint += "()";
//                } else { //Class or Variable
//                    while (i < size) {
//                        if (currInput.charAt(2) == 'C' && i == 4) {
//                            toPrint += Character.toUpperCase(currInput.charAt(i));
//                            i++;
//                        } else if (currInput.charAt(i) == ' ') {
//                            i++;
//                            toPrint += Character.toUpperCase(currInput.charAt(i));
//                            i++;
//                        } else {
//                            toPrint += currInput.charAt(i);
//                            i++;
//                        }
//                    }
//                }
//            }
//            System.out.println(toPrint);
//        }
//        in.close();
        
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {

            String operacion = s.nextLine();
            String imprimir = "";
            int i = 4;

            int tamano = operacion.length();

            if (operacion.charAt(0) == 'S') {
                //Dividir Split
                if (operacion.charAt(2) == 'M') {

                    while (i < tamano - 2) {

                        if (operacion.toUpperCase().charAt(i) == operacion.charAt(i)) {
                            imprimir += " " + operacion.toLowerCase().charAt(i);
                        } else {
                            imprimir += operacion.charAt(i);
                        }

                        i++;
                    }

                } else if (operacion.charAt(2) == 'C') {

                    while (i < tamano) {

                        if(i == 4){
                            imprimir += operacion.toLowerCase().charAt(i);
                            i++;
                        }
                        if (operacion.toUpperCase().charAt(i) == operacion.charAt(i)) {
                            imprimir += " " + operacion.toLowerCase().charAt(i);
                        } else {
                            imprimir += operacion.charAt(i);
                        }

                        i++;
                    }

                } else if (operacion.charAt(2) == 'V') {

                    while (i < tamano) {

                        if (operacion.toUpperCase().charAt(i) == operacion.charAt(i)) {
                            imprimir += " " + operacion.toLowerCase().charAt(i);
                        } else {
                            imprimir += operacion.charAt(i);
                        }

                        i++;
                    }

                }

            } else {
                // Combinacion/ Combine

                if (operacion.charAt(2) == 'M') {
                    
                    
                     while (i < tamano) {
                         

                             
                             if(operacion.charAt(i) == ' '){
                                 imprimir += operacion.toUpperCase().charAt(i+1);
                                 i++;
                             }else{
                                 
                                 imprimir+= operacion.charAt(i);
                                 
                             }
                        i++;
                    }
                     
                     imprimir += "()";
                    

                } else if (operacion.charAt(2) == 'C') {
                    
                      while (i < tamano) {
                         

                             if( i == 4){
                                 imprimir += operacion.toUpperCase().charAt(i);
                                 i++;
                             }
                          
                             if(operacion.charAt(i) == ' '){
                                 imprimir += operacion.toUpperCase().charAt(i+1);
                                 i++;
                             }else{
                                 
                                 imprimir+= operacion.charAt(i);
                                 
                             }
                        i++;
                    }
                    
                    

                } else if (operacion.charAt(2) == 'V') {

                    
                     while (i < tamano) {
                         

                             
                             if(operacion.charAt(i) == ' '){
                                 imprimir += operacion.toUpperCase().charAt(i+1);
                                 i++;
                             }else{
                                 
                                 imprimir+= operacion.charAt(i);
                                 
                             }
                        i++;
                    }

                    
                }

            }

            System.out.println(imprimir);

        }
        s.close();
    }

}
