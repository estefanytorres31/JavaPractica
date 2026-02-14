package seccion4;

import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("****Recetas de Cocina****");

        //Inicializacion de Scanner
        var consola= new Scanner(System.in);

        //Solicitar el nombre del platillo
        System.out.print("Ingrese el nombre del platillo: ");
        var platillo = consola.nextLine();

        //Solicitar los ingredientes
        System.out.print("Ingrese los ingredientes (separados por comas): ");
        var ingredientes = consola.nextLine();

        //Solicitar el tiempo de preparación
        System.out.print("Ingrese el tiempo de preparación (en minutos): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese la dificultad de la receta (Fácil, Medio, Difícil): ");
        var dificultad = consola.nextLine();

        //Mostrar la receta
        System.out.println("\n****Receta de cocina****");
        System.out.println("Platillo: " + platillo);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparación: " + tiempoPreparacion + " minutos");
        System.out.println("Dificultad: " + dificultad);
    }
}
