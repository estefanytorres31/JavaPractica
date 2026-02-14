package seccion4;

import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de empleados");
        var consola= new Scanner(System.in);

        //Nombre de empleado
        System.out.print("Ingrese el nombre del empleado: ");
        var nombre= consola.nextLine();

        //Edad del empleado
        System.out.print("Ingrese la edad del empleado: ");
        var edad= Integer.parseInt(consola.nextLine());

        //Salario del empleado
        System.out.print("Ingrese el salario del empleado: ");
        var salario= Double.parseDouble(consola.nextLine());

        //Preguntamos si es jefe
        System.out.print("¿El empleado es jefe? (true/false):");
        var esJefe= Boolean.parseBoolean(consola.nextLine());

        //Mostramos la información del empleado
        System.out.println("\nInformación del Empleado:");
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tEdad: " + edad + " años");
        //System.out.println("\tSalario: S/." + salario);
        System.out.printf("\tSalario: S/. %.2f%n", salario); //Formateamos el salario a 2 decimales, %n es un salto de linea
        System.out.println("\t¿Es Jefe?: " + esJefe);
    }
}
