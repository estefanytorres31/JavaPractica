package seccion6;

import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("Sistema de Calificaciones");

        //Inicializamos scanner
        var consola = new Scanner(System.in);
        String conversionCalificacion;

        //Solicitamos al usuario que ingrese una calificación
        System.out.print("Ingrese una calificación (0-10): ");
        var calificacion = Double.parseDouble(consola.nextLine());

        // Si es mayor o igual a 9 y menor o igual a 10, es una A
        // Si es mayor o igual a 8 y menor a 9, es una B
        // Si es mayor o igual a 7 y menor a 8, es una C
        // Si es mayor o igual a 6 y menor a 7, es una D
        // Si es menor a 6, es una F
        //En otro caso, la calificación es inválida

         conversionCalificacion = calificacion >= 9 && calificacion <= 10 ? "A" :
                calificacion >= 8 && calificacion < 9 ? "B" :
                calificacion >= 7 && calificacion < 8 ? "C" :
                calificacion >= 6 && calificacion < 7 ? "D" :
                calificacion < 6 && calificacion >= 0 ? "F" : "Inválida";

        System.out.printf("La calificación %.2f corresponde a la letra: %s%n", calificacion, conversionCalificacion);

    }
}
