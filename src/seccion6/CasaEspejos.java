package seccion6;

import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        System.out.println("Casa de Espejos");

        final var EDAD_MINIMA=10;

        //inicializamos scanner
        var consola =new Scanner(System.in);

        //Solicitar la edad del usuario
        System.out.print("¿Cuál es tu edad?: ");
        var edad = Integer.parseInt(consola.nextLine());

        //Pedimos información sobre si el usuario tiene miedo a la oscuridad
        System.out.print("¿Tienes miedo a la oscuridad? (true/false): ");
        var tieneMiedoOscuridad = Boolean.parseBoolean(consola.nextLine());

        //Si el usuario tiene al menos 10 años y no tiene miedo a la oscuridad, puede entrar a la casa de los espejos
        //De lo contrario, no puede entrar
        var cumpleCondiciones = edad >= EDAD_MINIMA && !tieneMiedoOscuridad;

        if (!cumpleCondiciones){
            System.out.println("Lo siento, no puedes entrar a la casa de los espejos.");
        } else {
            System.out.println("¡Bienvenido a la casa de los espejos! Disfruta tu visita.");
        }





    }
}
