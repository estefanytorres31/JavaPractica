package seccion6;

import java.util.Scanner;

public class SaludFitness {
    public static void main(String[] args) {
        System.out.println("---APP SALUD Y FITNESS---");

        //Inicializamos scanner para leer datos desde la consola
        var consola = new Scanner(System.in);

        //Inicializamos variables
        final var META_PASOS_DIARIOS = 10000;
        final var CALORIAS_POR_PASO = 0.04; //Calorías quemadas por cada paso

        //Solicitamos nombre dle usuario
        System.out.print("Por favor, ingrese su nombre: ");
        var nombre = consola.nextLine();

        //Solicitamos los pasos caminados por dia
        System.out.print("Ingrese el número de pasos caminados por día: ");
        var pasos = Integer.parseInt(consola.nextLine());

        //Calculamos las calorías quemadas
        var caloriasQuemadas = pasos * CALORIAS_POR_PASO;

        var meta_alcanzada = (pasos >= META_PASOS_DIARIOS) ? "Sí :)" : "No :(";

        System.out.printf("""
                %nUsuario: %s
                Pasos caminados por día: %d
                Calorías quemadas: %.2f
                ¿Meta de pasos diarios alcanzada? %s
                ------------------------------
                La meta diaria de pasos es de %d pasos.
                """, nombre, pasos, caloriasQuemadas, meta_alcanzada, META_PASOS_DIARIOS);


    }
}
