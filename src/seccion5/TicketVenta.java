package seccion5;

import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("----Ticket de venta----");
        var consola = new Scanner(System.in);
        final var IGV = 0.18; //Impuesto General a las Ventas

        //Solicitar el precio de los productos
        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio huevos: ");
        var precioHuevos = Double.parseDouble(consola.nextLine());

        //Cuanto es el descuento
        System.out.print("¿Cuánto es el descuento? (en porcentaje, por ejemplo 10 para 10%): ");
        var porcentajeDescuento = Double.parseDouble(consola.nextLine());

        //Calcular el subtotal
        var subtotal = precioLeche + precioPan + precioHuevos;

        //Calcular el monto del descuento
        var descuento = subtotal * (porcentajeDescuento / 100.0);

        //Aplicar el descuento al subtotal
        var subtotalConDescuento = subtotal-descuento;

        //Calcular el IGV
        var igv = subtotalConDescuento * IGV;

        //Calcular el total con IGV
        var total = subtotalConDescuento + igv;

        System.out.printf("""
                Subtotal: S/. %.2f
                Descuento (%.2f%%): S/. %.2f
                IGV (18%%): S/. %.2f
                Total a pagar: S/. %.2f
                """,subtotal,porcentajeDescuento,descuento,igv,total);
    }
}
