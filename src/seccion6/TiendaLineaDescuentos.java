package seccion6;

import java.util.Scanner;

public class TiendaLineaDescuentos {
    public static void main(String[] args) {
        System.out.println("Tienda en línea - Descuentos");
        //Inicializamos el scanner
        var consola = new Scanner(System.in);

        //Solicitamos el mmonto de la compra
        System.out.print("Ingrese el monto de su compra: ");
        var montoCompra = Double.parseDouble(consola.nextLine());

        //Verificamos si es miembro de la tienda
        System.out.print("¿Es usted miembro de la tienda? (true/false): ");
        var esMiembro = Boolean.parseBoolean(consola.nextLine());


        //Si el monto es mayor a 1000 y es miembro, aplicamos 10% de descuento
        //Si solo es miembro, aplicamos 5% de descuento
        //Si solo el monto es mayor a 1000, aplicamos 3% de descuento
        //Si no cumple ninguna de las condiciones, no aplicamos descuento

        final var MONTO_MINIMO_COMPRA = 1000;
        final var DESCUENTO_MEMBRESIA = 0.05;
        final var DESCUENTO_MONTO = 0.03;
        final var DESCUENTO_MEMBRESIA_MONTO = 0.10;

        double descuento, totalPagar;

        if (montoCompra>=MONTO_MINIMO_COMPRA && esMiembro) {
            descuento = montoCompra * DESCUENTO_MEMBRESIA_MONTO;
            totalPagar = montoCompra -descuento;
            System.out.printf("""
                    Felicidades! Has obtenido un descuento del 10%%
                    Monto de la compra: S/. %.2f
                    Descuento aplicado: S/. %.2f
                    Total a pagar: S/. %.2f
                    """, montoCompra,descuento,totalPagar);
        } else if (esMiembro) {
            descuento = montoCompra * DESCUENTO_MEMBRESIA;
            totalPagar = montoCompra -descuento;
            System.out.printf("""
                    Felicidades! Has obtenido un descuento del 5%%
                    Monto de la compra: S/. %.2f
                    Descuento aplicado: S/. %.2f
                    Total a pagar: S/. %.2f
                    """, montoCompra,descuento,totalPagar);
        } else if (montoCompra>=MONTO_MINIMO_COMPRA) {
            descuento = montoCompra * DESCUENTO_MONTO;
            totalPagar = montoCompra -descuento;
            System.out.printf("""
                    Felicidades! Has obtenido un descuento del 3%%
                    Monto de la compra: S/. %.2f
                    Descuento aplicado: S/. %.2f
                    Total a pagar: S/. %.2f
                    """, montoCompra,descuento,totalPagar);
        } else {
            System.out.printf("""
                    No obtuviste ni un descuento!
                    Te invitamos a hacerte miembro de la tienda
                    Total a pagar: S/. %.2f
                    """, montoCompra);
        }
    }
}
