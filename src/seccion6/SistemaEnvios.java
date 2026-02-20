package seccion6;

import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("Sistema de Envios en Java");

        //Inicializa scanner
        var consola = new Scanner(System.in);
        final var COSTO_ENVIO_NACIONAL = 10.0;
        final var COSTO_ENVIO_INTERNACIONAL = 20.0;

        //Solicitamos al usuario que ingrese el destino del envío
        System.out.print("Ingrese el destino del envío (nacional/internacional): ");
        var destino = consola.nextLine().strip().toLowerCase(); //strip() elimina espacios en blanco al inicio y al final, toLowerCase() convierte a minúsculas


        //Solicitamos el peso del paquete
        System.out.print("Ingrese el peso del paquete en kg: ");
        var peso = Double.parseDouble(consola.nextLine());

        //Calculamos el costo del envío
        double costoEnvio;
        costoEnvio = switch (destino) {
            case "nacional" -> peso * COSTO_ENVIO_NACIONAL;
            case "internacional" -> peso * COSTO_ENVIO_INTERNACIONAL;
            default -> {
                System.out.println("\nDestino no válido. Por favor, ingrese 'nacional' o 'internacional'.");
                yield 0.0; //yield se usa para devolver un valor desde un bloque de código en un switch expression
            }
        };

        if (costoEnvio > 0.0) {
            System.out.printf("\nEl costo del envío para un paquete de %.2f kg a %s es: S/. %.2f%n", peso, destino, costoEnvio);
        }
    }
}
