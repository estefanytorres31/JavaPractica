package seccion5;

import java.util.Scanner;

public class DentroRango {
    public static void main(String[] args) {
        System.out.println("Verificar si un número está dentro de un rango: ");
        //Limites
        final var MINIMO=0;
        final var MAXIMO=5;
        //Valores
        System.out.print("Proporciona un número entre " + MINIMO + " y " + MAXIMO+ ": ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        //Verificar si el número está dentro del rango
        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO;
        //Mostrar el resultado
        System.out.println("¿El número " + dato + " está dentro del rango de " + MINIMO + " a " + MAXIMO + "? " + estaDentroRango);



    }
}
