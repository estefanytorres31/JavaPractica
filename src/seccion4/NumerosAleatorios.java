package seccion4;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("Números Aleatorios en Java");
        Random random = new Random();
        //Generar un número aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("Número aleatorio entre 0 y 9: " + numeroAleatorio);

        //Generar un número aleatorio entre 1 y 100
        numeroAleatorio= random.nextInt(100) + 1;
        System.out.println("Número aleatorio entre 1 y 100: " + numeroAleatorio);

        //Generar un numero flotante aleatorio entre 0.0 y 1.0
        var numeroFlotanteAleatorio = random.nextFloat(); //Por defecto genera un número entre 0.0 y 1.0
        System.out.println("Número flotante aleatorio entre 0.0 y 1.0: " + numeroFlotanteAleatorio);

        //Simular lanzamiento de un dado (número aleatorio entre 1 y 6)
        var dado = random.nextInt(6) + 1;
        System.out.println("Número aleatorio simulado para un dado (1-6): " + dado);
    }
}
