package tarea07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Ejercicio 4. Clasificación de coincidentes
 *
 * @author profe
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        final int CANTIDAD_COLORES = 15;
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();

        HashMap<String, ArrayList<Integer>> coincidencia = new HashMap<String, ArrayList<Integer>>();

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("CLASIFICACIÓN DE COINCIDENTES");
        System.out.println("-----------------------------");
        // No hay, pues se usa un número fijo de elementos aleatorios

        // Rellenamos la lista con aleatorios hasta que haya CANTIDAD_NUMEROS
        //----------------------------------------------
        //                 Procesamiento
        //----------------------------------------------
        for (int i = 0; i < CANTIDAD_COLORES; i++) {
            l1.add(Utilidades.colorAleatorio());
            l2.add(Utilidades.colorAleatorio());

        }
        System.out.println("Contenido de la lista1: " + l1.toString());
        System.out.println("Contenido de la lista2: " + l2.toString());
        for (int i = 0; i < CANTIDAD_COLORES; i++) {
            String color1 = l1.get(i);
            String color2 = l2.get(i);

            if (color1.equals(color2)) {

                if (!coincidencia.containsKey(color2)) {
                    coincidencia.put(color2, new ArrayList<Integer>());

                }

                coincidencia.get(color2).add(i);

            }

        }
        System.out.println(coincidencia.toString());
        //----------------------------------------------
        //           Salida de resultados
        //----------------------------------------------
    }

}
