package seccion6;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        System.out.println("Comparar dos números para determinar cuál es mayor");

        //Inicializa scanner
        var consola = new Scanner(System.in);

        //Solicitamos 2 numeros al usuario
        System.out.print("Ingrese el primer número: ");
        var numero1 = Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese el segundo número: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        var mensaje = (numero1 > numero2) ? "El número mayor es: " + numero1 : (numero2 > numero1) ? "El número mayor es: " + numero2 : "Ambos números son iguales.";

        System.out.println(mensaje);
    }
}
