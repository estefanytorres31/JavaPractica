package seccion5;

import java.util.Scanner;

public class SistemaPrestamosLibros {
    public static void main(String[] args) {
        System.out.println("** Sistema de Préstamos de Libros **");

        var consola = new Scanner(System.in);
        final var DISTANCIA_MAXIMA = 3; //Constante para la distancia máxima en kilómetros

        //Solicitar el título del libro
        //Solicitar si tiene credencial de estudiante
        //Si es usuario vive a no mas de 3km a la redonde
        //Si cumple con cualquiera de las condiciones, se le presta el libro, sino se le niega el préstamo

        //Solicitar el título del libro
        System.out.print("Ingrese el título del libro que desea prestar: ");
        var tituloLibro = consola.nextLine();

        //Solicitar si tiene credencial de estudiante
        System.out.print("¿Tiene credencial de estudiante? (true/false): ");
        var tieneCredencialEstudiante = Boolean.parseBoolean(consola.nextLine());

        //Solicitar la distancia a la biblioteca
        System.out.print("¿A qué distancia vive de la biblioteca? (en kilómetros): ");
        var distanciaVivienda = Double.parseDouble(consola.nextLine());
        var viveCercaBiblioteca = distanciaVivienda < DISTANCIA_MAXIMA;

        var puedePrestarLibro = tieneCredencialEstudiante || viveCercaBiblioteca; //El operador lógico OR (||) devuelve true si al menos una de las condiciones es verdadera

        System.out.println("\nResultado del libro "+ tituloLibro +" préstamo: "+ puedePrestarLibro);

    }
}
