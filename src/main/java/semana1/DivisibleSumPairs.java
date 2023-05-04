/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kevin
 */
public class DivisibleSumPairs {

    public static void main(String[] args) {
         List<List<Integer>> lista1 = new ArrayList<>();

        
        
        List<Integer> lista2 = new ArrayList<>();

        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);
        lista2.add(5);
        
        lista1.add(lista2);
        
//        for(List<Integer> listaList : lista1 ){
//            
//            for(Integer listaNum : lista2){
//                System.out.println(listaNum);
//            }
//            
//        }
        
        
        
        

        //Se crea el mapa con sus nombres, con una lista de los jugadores
        Map<String, List> mapaClubes = new HashMap<String, List>();
        
        
        
        //Se crea la lista que van a tener los jugadores, de tipo mapa 
        List<Map> listaJugadores = new ArrayList<>();
        
        
        
        //Creo un jugador
         Map<String, Object> mapaJugador1 = new HashMap<String, Object>();
         mapaJugador1.put("Nombre", "Messi");
         mapaJugador1.put("edad", 30);
         
         
         //creo un segundo jugador
          Map<String, Object> mapaJugador2 = new HashMap<String, Object>();
         mapaJugador2.put("Nombre", "Pique");
         mapaJugador2.put("edad", 50);
         
          Map<String, Object> mapaJugador3 = new HashMap<String, Object>();
         mapaJugador3.put("Nombre", "Pique");
         mapaJugador3.put("edad", 30);
         
         
         
         //Agrego los 2 jugadores a la misma lista, eso significa que los agrego al mismo equipo.
         listaJugadores.add(mapaJugador1);
         listaJugadores.add(mapaJugador2);
         listaJugadores.add(mapaJugador3);
         
         
         
         //agrego al mapa Principal, un equipo que es el barca y de valor, le mande la lista conn los 2 jugadores qye habia creado anteriormente
         mapaClubes.put("Barcelona", listaJugadores);
         
        
         
         
         System.out.println(mapaClubes);
//         for(Map.Entry<String, List> clubes : mapaClubes.entrySet()){
//             
//             System.out.println("clave : " + clubes.getKey() + ", valor: " + clubes.getValue());
//             
//         }
         
//         int sumar = 0;
//        
//         int contadorEdades=0;
//         
//         for(Map.Entry<String, List> clubes : mapaClubes.entrySet()){
//            
//             if(clubes.getKey().equals("Barcelona")){
//                 
//                 for(Map jugador : listaJugadores){
//                     
//                     System.out.println("Jugadores... " + jugador);
//                     sumar += jugador.get("edad").hashCode();
//                     
//                     if(jugador.get("edad").hashCode() == 30){
//                         contadorEdades = contadorEdades +1;
//                     }
//                     
//                 }
//                 
//                 
//                 
//             }
//             
//         }
//         
//         System.out.println(sumar);
//         System.out.println("Jugadores con 30 años: " +contadorEdades);
         
        

    }
}
