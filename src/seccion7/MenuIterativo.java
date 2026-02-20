package seccion7;

import java.util.Scanner;

public class MenuIterativo {
    public static void main(String[] args) {
        //iniciamos scanner
        var consola = new Scanner(System.in);

        var salir = false;

        while(!salir){
            System.out.print("""
                    ***SISTEMA DE ADMINISTRACIÓN DE USUARIOS***
                    1. Crear usuario
                    2. Eliminar usuario
                    3. Salir
                    Escoja una opción (1-3):\s""");
            var opcion = Integer.parseInt(consola.nextLine());

            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta ...\n");
                case 2 -> System.out.println("Eliminando tu cuenta ...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema ...\n");
                    salir = true;
                }
                default -> System.out.println("Opción inválida. Por favor ingresa un número del 1 al 3.\n");
            }
            System.out.println("---------------------------------------------\n");
        }

    }
}
