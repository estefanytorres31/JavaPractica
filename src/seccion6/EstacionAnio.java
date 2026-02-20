package seccion6;

import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {
        System.out.println("Determinar la estación del año según el mes");

        var consola = new Scanner(System.in);

        System.out.print("Ingresa el número del mes (1-12): ");
        var mes = Integer.parseInt(consola.nextLine());

        var estacion="";
        estacion = (mes == 1 || mes == 2 || mes == 12) ? "Invierno" :
                       (mes >= 3 && mes <= 5) ? "Primavera" :
                       (mes >= 6 && mes <= 8) ? "Verano" :
                       (mes >= 9 && mes <= 11) ? "Otoño" : "Estación inválida";

        System.out.printf("%nEl mes %d corresponde a la estación: %s%n", mes, estacion);

//        //Otra manera de hacerlo con switch
//        estacion=switch (mes){
//            case 1, 2, 12 -> "Invierno";
//            case 3, 4, 5 -> "Primavera";
//            case 6, 7, 8 -> "Verano";
//            case 9, 10, 11 -> "Otoño";
//            default -> "Estación inválida";
//        };
//        System.out.printf("%nEl mes %d corresponde a la estación: %s%n", mes, estacion);
    }
}
