package seccion6;

import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        System.out.println("Uso de la sentencia switch en Java");

        //Inicializamos scanner
        var consola = new Scanner(System.in);
        String nombreDia;

        System.out.print("Ingresa un número del 1 al 7 para conocer el día de la semana: ");
        var dia = Integer.parseInt(consola.nextLine());

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido. Por favor ingresa un número del 1 al 7.");
        }

//        //Otra forma de hacerlo con Switch
//        nombreDia = switch (dia){
//            case 1 -> "Lunes";
//            case 2 -> "Martes";
//            case 3 -> "Miércoles";
//            case 4 -> "Jueves";
//            case 5 -> "Viernes";
//            case 6 -> "Sábado";
//            case 7 -> "Domingo";
//            default -> "Número inválido. Por favor ingresa un número del 1 al 7.";
//        };
//        System.out.println(nombreDia);


    }
}
