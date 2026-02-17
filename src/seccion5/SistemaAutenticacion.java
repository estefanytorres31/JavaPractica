package seccion5;

import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("Sistema de autenticación");

        var consola = new Scanner(System.in);
        final var USUARIO = "admin";
        final var CLAVE = "12345";

        //Solicitar al usuario que ingrese su nombre de usuario y contraseña
        System.out.print("Por favor, ingrese su nombre de usuario: ");
        var usuarioIngresado = consola.nextLine();

        System.out.print("Por favor, ingrese su contraseña: ");
        var claveIngresada = consola.nextLine();

        //Verificar si el nombre de usuario y la contraseña son correctos
        //Se usa el método equals para comparar el contenido de las cadenas, no el operador == que compara referencias
        var sonDatosCorrectos = USUARIO.equals(usuarioIngresado) && CLAVE.equals(claveIngresada); //Comparación de referencias, no es correcto para comparar cadenas

        //Mostrar el resultado de la autenticación
        System.out.println("¿La autenticación fue exitosa? " + sonDatosCorrectos);
    }
}
