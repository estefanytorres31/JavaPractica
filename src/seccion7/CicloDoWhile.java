package seccion7;

public class CicloDoWhile {
    public static void main(String[] args) {
        System.out.println("Ciclo Do-While en Java");

        //Sintaxis
        // do {
        //     //Bloque de código a ejecutar
        // } while (condición);
        // El bloque de código se ejecuta al menos una vez, y luego se evalúa la condición. Si la condición es verdadera, el ciclo continúa; si es falsa, el ciclo termina.
        //Diferencia con el ciclo while: El ciclo while evalúa la condición antes de ejecutar el bloque de código, por lo que si la condición es falsa desde el principio, el bloque de código no se ejecutará ni una sola vez.


        var contador = 1;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 5);
    }
}
