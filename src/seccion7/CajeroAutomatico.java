package seccion7;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        //Inicializamos el scanner para leer la entrada del usuario
        var consola= new Scanner(System.in);
        //Variables para controlar el flujo del programa
        var salir = false;
        var saldo = 1000.00;

        while (!salir){
            //Mostremos el menu de opciones al usuario
            System.out.print("""
                    ***SISTEMA DE CAJERO AUTOMATICO***
                    1. Consultar saldo
                    2. Retirar dinero
                    3. Depositar dinero
                    4. Salir
                    Elige una opción (1-4):\s""");

            var opcion = Integer.parseInt(consola.nextLine());

            switch (opcion){
                case 1 -> System.out.println("Tu saldo actual es: "+saldo+"\n");
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
