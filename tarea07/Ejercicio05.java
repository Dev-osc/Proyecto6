package tarea07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javax.print.attribute.HashAttributeSet;

/** Ejercicio 5. Clasificación de fechas por día de la semana
 * @author profe
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        final int YEAR_MIN = 1900;
        final int YEAR_MAX = 2100;
        Scanner teclado = new Scanner(System.in);
        int año;
        Map relleno = new HashMap();

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("CLASIFICACIÓN DE FECHAS DE UN AÑO POR DÍA DE LA SEMANA");
        System.out.println("------------------------------------------------------");
        
        
        System.out.println("Introduzca año (1900-2100): " );
        año = teclado.nextInt();
        //----------------------------------------------
        //                  Procesamiento
        //----------------------------------------------
        if (año>YEAR_MIN & año<YEAR_MAX) {
            
        }
        
        
        
        //----------------------------------------------
        //           Salida de resultados
        //----------------------------------------------
        System.out.println("MUESTREO DE FECHAS");
        System.out.println("------------------");
        
        System.out.println();
        System.out.printf ("Fechas de febrero que caen en lunes: \n");

        System.out.println();
        System.out.printf ("Fechas de marzo que caen en jueves: \n");

        System.out.println();
        System.out.printf ("Fechas de diciembre que caen en domingo: \n");

        System.out.println();
        
        
    }

}
