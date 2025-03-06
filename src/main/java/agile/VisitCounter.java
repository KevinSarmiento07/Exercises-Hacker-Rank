/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agile;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author kevin
 */
public class VisitCounter {
    public static void main(String[] args) {
        VisitCounter visitCounter = new VisitCounter();

        // Creación de datos de prueba
        Map<String, UserStats> visits1 = new HashMap<>();
        visits1.put("1001", new UserStats(Optional.of(5L)));  // Usuario 1001 con 5 visitas
        visits1.put("1002", new UserStats(Optional.of(3L)));  // Usuario 1002 con 3 visitas
        visits1.put("invalid", new UserStats(Optional.of(10L))); // Clave inválida, debe ser ignorada
        visits1.put("1003", null); // Valor nulo, debe ser ignorado
        visits1.put("1004", new UserStats(Optional.empty())); // Visitas vacías, debe ser ignorado

        Map<String, UserStats> visits2 = new HashMap<>();
        visits2.put("1001", new UserStats(Optional.of(7L)));  // Usuario 1001 con 7 visitas más
        visits2.put("1005", new UserStats(Optional.of(2L)));  // Usuario 1005 con 2 visitas

        // Llamar al método count con los mapas de visitas
        Map<Long, Long> result = visitCounter.count(visits1, visits2);

        // Imprimir el resultado
        System.out.println("Número de visitas por usuario:");
        result.forEach((userId, visitCount) -> System.out.println("Usuario " + userId + ": " + visitCount + " visitas"));
    }
    Map<Long, Long> count(Map<String, UserStats>... visits) {
        if (visits == null || visits.length == 0){
            return Collections.emptyMap();
        }
        return Arrays.stream(visits)
                .filter(map -> map != null)
                .flatMap(map -> map.entrySet().stream())
                .filter(entry -> isValidLong(entry.getKey()))
                .map(entry -> new AbstractMap.SimpleEntry<>(Long.parseLong(entry.getKey()), entry.getValue()))
                .filter(entry -> entry.getValue() != null && entry.getValue().getVisitCount().isPresent())
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    entry -> entry.getValue().getVisitCount().get(),
                    Long::sum
                ));
    }
    private boolean isValidLong(String key) {
        try {
            Long.parseLong(key);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

class UserStats {
    private final Optional<Long> visitCount;

    public UserStats(Optional<Long> visitCount) {
        this.visitCount = visitCount;
    }

    public Optional<Long> getVisitCount() {
        return visitCount;
    }
}