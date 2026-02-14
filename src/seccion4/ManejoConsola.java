package seccion4;
import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        //Manejo de la consola usando la clase Scanner
        var consola= new Scanner(System.in); //in - input - entrada de datos
        System.out.print("Ingrese su nombre: ");
        var nombre= consola.nextLine();
        System.out.println("¡Hola, " + nombre + "!");
    }
}
