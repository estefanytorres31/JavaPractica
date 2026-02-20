package seccion7;

public class CicloWhile {
    public static void main(String[] args) {
        System.out.println("Ciclo While en Java");
        //Ejemplo: Contar del 1 al 5
        int contador=1;

        //Sintaxis del ciclo while
        // while (condición) {
        //     // Bloque de código a ejecutar mientras la condición sea verdadera
        // }
        while (contador <= 5){
            System.out.println("Contador: " + contador);
            contador++; //Incrementar el contador para evitar un ciclo infinito
        }
    }
}
