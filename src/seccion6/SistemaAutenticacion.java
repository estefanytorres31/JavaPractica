package seccion6;

import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("Sistema de Autenticación");

        //Inicializa el scanner
        var consola = new Scanner(System.in);

        //Constantes para el usuario y la contraseña
        final var USUARIO_VALIDO = "admin";
        final var CLAVE_VALIDA = "12345";

        //Solicitamos el usuario y la contraseña al usuario
        System.out.print("Por favor, ingrese su nombre de usuario: ");
        var usuarioIngresado = consola.nextLine().strip();

        System.out.print("Por favor, ingrese su contraseña: ");
        var claveIngresada = consola.nextLine().strip();

        //Verificamos si el usuario y la contraseña son correctos
        var usuarioValido = USUARIO_VALIDO.equals(usuarioIngresado);
        var claveValida = CLAVE_VALIDA.equals(claveIngresada);

        var estadoAutenticacion = usuarioValido && claveValida ? "Bienvenido al sistema!":
                usuarioValido ? "Contraseña incorrecta :(" :
                claveValida ? "Usuario incorrecto :(" :
                "Usuario y contraseña incorrectos :(";

        System.out.println(estadoAutenticacion);

//        //Otra forma de hacerlo con switch
//        var estadoAutenticacionSwitch = switch (usuarioIngresado) {
//            case USUARIO_VALIDO -> {
//                if(claveValida)
//                    yield "Bienvenido al sistema!";
//                else
//                    yield "Contraseña incorrecta :(";
//            }
//            default -> {
//                if (claveValida)
//                    yield "Usuario incorrecto :(";
//                else
//                    yield "Usuario y contraseña incorrectos :(";
//            }
//        };
//        System.out.println(estadoAutenticacionSwitch);
    }
}
