package tarea07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Ejercicio 2. Búsqueda de coincidentes
 *
 * @author Óscar Marín
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        final int CANTIDAD_COLORES = 10;

        ArrayList<String> l1 = new ArrayList<>(); //lista 1 arrays
        ArrayList<String> l2 = new ArrayList<>(); //lista 2 arrays
        ArrayList<String> eliminados = new ArrayList<>(); //lista eliminados arrays
        ArrayList<Integer> posicionesEliminados = new ArrayList<>(); //lista posicion arrays
        Set eliminadosUnico = new HashSet(); //Utilizamos hashSet para que coja la lista unica de eliminados
        
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("BÚSQUEDA DE COINCIDENTES");
        System.out.println("------------------------");
        // No hay, pues se usa un número fijo de elementos aleatorios

        // Rellenamos la lista con aleatorios hasta que haya CANTIDAD_COLORES
        //----------------------------------------------
        //               Procesamiento
        //----------------------------------------------
        for (int i = 0; i < CANTIDAD_COLORES; i++) { //Utilizamos un for para recorer la cantidad de colores y que no sea superior.
            l1.add(Utilidades.colorAleatorio());    //Añadimos un .add a lista1 y asignamos un color aleatorio
            l2.add(Utilidades.colorAleatorio());     //Añadimos un .add a lista2 y asignamos un color aleatorio

        }
        System.out.println("Contenido inicial de la lista1: " + l1.toString()); //Mostramos por pantalla la lista1
        System.out.println("Contenido inicial de la lista2: " + l2.toString()); //Mostramos por pantalla la lista2

        for (int i = 0; i < CANTIDAD_COLORES; i++) { // volvemos a recorrer cantidad de colores
            String color1 = l1.get(i); //asignamos colores a lista 1 hasta el maximo de cantidad colores
            String color2 = l2.get(i); //asignamos colores a lista 2 hasta el maximo de cantidad colores

            if (color1.equals(color2)) { //utilizamos bucle para comparar

                eliminados.add(color1); //añadimos a array de eliminados los colores que se repirten
                posicionesEliminados.add(i); //buscamos la posicion de los eliminados en el array
                l1.set(i, "---"); //sustituimos el color repetido por "---" en lista1
                l2.set(i, "---"); //sustituimos el color repetido por "---" en lista2
            }

        }
        eliminadosUnico.addAll(eliminados); //Comparamos los eliminados y solo mostramos aquellos que no se repiten en la eliminacion
        //----------------------------------------------
        //            Salida de resultados
        //----------------------------------------------
        //Declaramos la informacion final con un toString.
        System.out.println("");
        System.out.println("Contenido final de la lista1: " + l1.toString());
        System.out.println("Contenido final de la lista2: " + l2.toString());
        System.out.println("Contenido final de la lista de colores eliminados: " + eliminados.toString());
        System.out.println("Contenido final de la lista de posiciones eliminadas: " + posicionesEliminados.toString());
        System.out.println("Contenido final del conjunto de colores eliminados: " + eliminadosUnico.toString());
    }

}
