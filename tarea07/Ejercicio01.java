package tarea07;

import java.util.HashSet;
import java.util.Set;
import static tarea07.Utilidades.*;

/**
 * Ejercicio 1. Combinando colores.
 *
 * @author Óscar Marín
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        final int CANTIDAD_COLORES = 3;

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        // No hay, pues se usa un número fijo de elementos aleatorios
        System.out.println("CONJUNTOS DE COLORES");
        System.out.println("--------------------");

        //----------------------------------------------
        //                  Procesamiento
        //----------------------------------------------
        // Rellenamos los conjuntos con aleatorios hasta que haya CANTIDAD_NUMEROS
        Set conj1 = new HashSet();                  // Creamos nuevo conjunto
        while (conj1.size() < CANTIDAD_COLORES) {  //Le decimos al tamaño de conjunto que no supere la cantidad de colores
            conj1.add(colorAleatorio());          //Permitirá añadir elementos a la colección.

        }

        //--------------------------------------------
        Set conj2 = new HashSet();                   // Creamos nuevo conjunto
        while (conj2.size() < CANTIDAD_COLORES) {   //Utilizamos while para decirlo que conj2 no sea mayor que CANTIDAD_COLORES
            conj2.add(colorAleatorio());           //Permitirá añadir elementos a la colección.

        }

        // Cálculo de la Unión de los dos conjuntos 
        Set conj3 = new HashSet();    // Creamos nuevo conjunto
        conj3.addAll(conj1);         //Permite añadir todos los elementos de una colección a otra colección, siempre que sean del mismo tipo (o deriven del mismo tipo base).
        conj3.addAll(conj2);        //Permite añadir todos los elementos de una colección a otra colección, siempre que sean del mismo tipo (o deriven del mismo tipo base).

        // Cálculo de la Intersección de los conjuntos
        Set conj4 = new HashSet();    // Creamos nuevo conjunto
        conj4.addAll(conj1);         //Permite añadir todos los elementos de una colección a otra colección, siempre que sean del mismo tipo (o deriven del mismo tipo base).
        conj4.retainAll(conj2);     // si los elementos de la colección pasada como parámetro están en nuestra colección, se dejan, el resto se eliminan.

        // Cálculo de la Diferencia de los conjuntos
        Set aux = new HashSet();      //aux es la resta del otro lado
        aux.addAll(conj2);           //Permite añadir todos los elementos de una colección a otra colección, siempre que sean del mismo tipo (o deriven del mismo tipo base).
        aux.removeAll(conj1);       //si los elementos de la colección pasada como parámetro están en nuestra colección, se eliminan, el resto se quedan.
        Set conj5 = new HashSet(); // Creamos nuevo conjunto
        conj5.addAll(conj1);      //creamos una copia de conjunto 1
        conj5.removeAll(conj2);  //si los elementos de la colección pasada como parámetro están en nuestra colección, se eliminan, el resto se quedan.
        conj5.addAll(aux);      //Permite añadir todos los elementos de una colección a otra colección, siempre que sean del mismo tipo (o deriven del mismo tipo base).

        //----------------------------------------------
        //              Salida de Resultados 
        //----------------------------------------------
        System.out.println("Conjunto C1: " + conj1.toString());

        System.out.println("Conjunto C2: " + conj2.toString());

        System.out.println("Unión C1 y C2: " + conj3.toString());

        System.out.println("Intersección C1 y C2: " + conj4.toString());

        System.out.println("Diferencia C1-C2: " + conj5.toString());

    }

}
