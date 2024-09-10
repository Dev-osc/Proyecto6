package tarea07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Ejercicio 3. Un color por día
 *
 * @author Óscar Marín
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        final int NUM_DIAS = 5;

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("ASIGNACIÓN DE COLORES: UN COLOR DIFERENTE POR CADA FECHA");
        System.out.println("--------------------------------------------------------");
        // No hay entrada de datos pues la estructura se rellena elementos aleatorios

        //----------------------------------------------
        //                  Procesamiento
        //----------------------------------------------
        Map coloresDiasMap = new HashMap();
        LocalDate fechaInicialDate = LocalDate.of(2021, Month.MARCH, 01);
        String color = "";
        for (int i = 1; i <= NUM_DIAS; i++) {
            do {
                color = Utilidades.colorAleatorio();
            } while (coloresDiasMap.containsValue(color));

            coloresDiasMap.put(i, color);

        }

        for (int i = 0; i < NUM_DIAS; i++) {
            LocalDate fecha = fechaInicialDate.plusDays(i);
            System.out.println(fecha + ": " + coloresDiasMap.get(fecha.getDayOfWeek().getValue()));

        }

        //----------------------------------------------
        //           Salida de resultados
        //----------------------------------------------
        System.out.printf("Contenido final del mapa de colores organizado por fechas:\n");
        System.out.println("Codigo de colores: " + coloresDiasMap.toString());

    }

}
