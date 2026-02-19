package seccion6;

import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("Sistema de Reserva de Hotel");

        //inicializamos scanner
        var consola =new Scanner(System.in);
        final var COSTO_CON_VISTA_MAR_DIARIO= 190.5;
        final var COSTO_SIN_VISTA_MAR_DIARIO= 150.5;

        //Solicitamos nombre del cliente
        System.out.print("Por favor, ingrese su nombre: ");
        var nombreCliente = consola.nextLine();

        //Solicitamos de dias de estadia
        System.out.print("Por favor, ingrese el número de días de estadía: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());

        //Solicitamos vista al mar
        System.out.print("¿Desea una habitación con vista al mar? (true/false): ");
        var deseaVistaMar = Boolean.parseBoolean(consola.nextLine());

        var costoPagar = deseaVistaMar ? diasEstadia*COSTO_CON_VISTA_MAR_DIARIO : diasEstadia*COSTO_SIN_VISTA_MAR_DIARIO;
        var tieneVistaMar = deseaVistaMar ? "Sí :)" : "No :(";

        System.out.printf("""
                RESERVA DE HOTEL:
                \tCliente: %s
                \tDías de estadía: %d
                \tHabitación con vista al mar: %s
                \tCosto total de la reserva: $%.2f
                """, nombreCliente, diasEstadia, tieneVistaMar, costoPagar);

    }
}
