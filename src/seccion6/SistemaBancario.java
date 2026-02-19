package seccion6;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("Sistema Bancario - Java");

        //Inicializamos scanner
        var consola = new Scanner(System.in);

        //Solicitamos al usuario si desea continuar en el sistema
        System.out.print("¿Desea continuar en el sistema bancario? (S/N): ");
        var respuesta = consola.nextLine();

        var deseaContinuar = respuesta.equalsIgnoreCase("S"); //equalsIgnoreCase compara sin importar mayúsculas o minúsculas

        //Verificamos la respuesta del usuario

        if(!deseaContinuar){
            System.out.println("Saliendo del sistema bancario...");
        } else {
            System.out.println("Continuando dentro sistema bancario!");
        }
//       //Otra forma de hacerlo con booleanos
//        System.out.print("¿Desea continuar en el sistema bancario? (true/false): ");
//        var respuesta = Boolean.parseBoolean(consola.nextLine());
//
//        if(!respuesta){
//            System.out.println("Saliendo del sistema bancario...");
//        } else {
//            System.out.println("Continuando dentro sistema bancario!");
//        }

    }
}
