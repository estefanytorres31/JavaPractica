package seccion4;

import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos en Java
        //Leer datos de tipo int
        var consola = new Scanner(System.in); //Creamos un objeto Scanner para leer desde la consola
        System.out.print("Ingrese un número entero: ");
        int numeroEntero = consola.nextInt();   //Leemos un número entero desde la consola
        System.out.println("Número entero ingresado: " + numeroEntero);

        //Leer datos de tipo double
        System.out.print("Ingrese tu peso: ");
        var peso = consola.nextDouble();     //Leemos un número decimal desde la consola
        System.out.println("Peso ingresado: " + peso + " kg");

        //Consumir el salto de línea pendiente después de leer un número
        consola.nextLine(); // Esto es necesario para evitar que el siguiente nextLine() lea un salto de línea en lugar de la entrada del usuario
        //Leer datos de tipo String
        System.out.print("Ingrese su nombre: ");
        var nombre= consola.nextLine(); //Leemos una línea de texto desde la consola
        System.out.println("Nombre ingresado: " + nombre);

        //Conversion de datos
        System.out.println("\n--- Conversión de Datos ---");
        //TIpo entero
        System.out.print("Proporciona tu edad: ");
        var edadTexto = consola.nextLine(); //Leemos la edad como texto
        var edadConvertida = Integer.parseInt(edadTexto); //Convertimos el texto a un número entero
        System.out.println("Edad convertida a entero: " + edadConvertida);

        //Tipo flotante
        System.out.print("Proporciona tu estatura en metros: ");
        var estatura= Float.parseFloat(consola.nextLine()); //Leemos la estatura como texto y la convertimos a float
        System.out.println("Estatura convertida a float: " + estatura + " metros");

        //Double.parseDouble() para convertir a double
        //Boolean.parseBoolean() para convertir a boolean
        //Long.parseLong() para convertir a long
        // Short.parseShort() para convertir a short
        // Byte.parseByte() para convertir a byte
    }
}
