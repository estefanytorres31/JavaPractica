package seccion6;

import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println("Valor Positivo en Java");
        //Inicializamos scanner para leer datos desde la consola
        var consola = new Scanner(System.in);

        //Solicitamos al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        var numero = Integer.parseInt(consola.nextLine());

        //Verificamos si el número es positivo

        var esPositivo = numero > 0;

        if (esPositivo) {
            System.out.println("El número " + numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        } else {
            System.out.println("El número es cero, no es ni positivo ni negativo.");
        }

    }
}
