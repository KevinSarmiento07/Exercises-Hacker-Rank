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
public class ReduceMatrix {

   public static List<Long> countMinimumOperations(List<Integer> precio, List<Integer> query) {
    int n = precio.size();
    int q = query.size();
    List<Long> result = new ArrayList<>();

    // Crear un mapa para realizar un seguimiento de la frecuencia de los precios originales
    Map<Integer, Integer> priceFrequency = new HashMap<>();

    // Calcular el número de operaciones requeridas para llegar a cada precio posible
    for (int i = 0; i < n; i++) {
        int originalPrice = precio.get(i);
        priceFrequency.put(originalPrice, priceFrequency.getOrDefault(originalPrice, 0) + 1);
    }

    // Calcular el costo total para llegar a cada precio posible
    long totalCost = 0;
    for (Map.Entry<Integer, Integer> entry : priceFrequency.entrySet()) {
        int targetPrice = entry.getKey();
        int frequency = entry.getValue();
        totalCost += (long) frequency * Math.abs(targetPrice - query.get(0));
    }

    result.add(totalCost);

    // Calcular el costo para las consultas restantes utilizando el costo total calculado anteriormente
    for (int i = 1; i < q; i++) {
        int previousQuery = query.get(i - 1);
        int currentQuery = query.get(i);
        int frequency = priceFrequency.get(previousQuery);
        totalCost += (long) frequency * Math.abs(currentQuery - previousQuery);
        result.add(totalCost);
    }
    
    System.out.println(result);
    return result;
}

    public static int reduceMax(List<Integer> arr) {

        return 0;

    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(25);

        arr.add(10);

        arr.add(20);

    }

}
