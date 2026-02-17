package seccion5;

import java.util.Scanner;

public class SistemaDescuentoVIP {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("SISTEMA DE DESCUENTO VIP");
        final var NO_PRODUCTOS_DESCUENTO=10;
        //Solicitamos el numero de productos comprados
        //Preguntar si tiene membresia de la tienda
        // En el caso de haber comprado mas de 10 productos y ser miembro, tendrá acceso al descuento VIP
        System.out.print("Ingrese el número de productos comprados: ");
        var numeroProductos = Integer.parseInt(consola.nextLine());

        System.out.print("¿Tiene membresía de la tienda? (true/false): ");
        var esMiembro = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento = numeroProductos >= NO_PRODUCTOS_DESCUENTO && esMiembro;

        System.out.println("\n¿Es elegible para el descuento VIP? " + esElegibleDescuento);
    }
}
