package seccion5;

import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        System.out.println("Rango de una variable en Java");

        var consola = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        var numero = Integer.parseInt(consola.nextLine());

        //Revisamos si está dentro de rango (entre 1 y 10)
        var dentroRango = numero >= 1 && numero <= 10;
        System.out.println("¿El número " + numero + " está dentro del rango de 1 a 10? " + dentroRango);

        //Revisar si el numero esta fuera de rango
        var fueraRango= !(numero >= 1 && numero <= 10);
        System.out.println("¿El número " + numero + " está fuera del rango de 1 a 10? " + fueraRango);

    }
}
