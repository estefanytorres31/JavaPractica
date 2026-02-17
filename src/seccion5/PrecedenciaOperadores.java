package seccion5;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        System.out.println("Precedencia de operadores en Java");
        // Precedencia de operadores
        // 1. Paréntesis () o corchetes [] o llaves {}
        // 2. Operadores unarios: ++, --, +, -
        // 3. Operadores multiplicativos: *, /, %
        // 4. Operadores aditivos: +, -
        // 5. Operadores de comparación: <, >, <=, >=
        // 6. Operadores de igualdad: ==, !=
        // 7. Operadores lógicos: &&, ||
        // 8. Operadores de asignación: =, +=, -=, *=, /=, %=
        // 9. Operadores de secuencia: , (coma)

        //Ejemplo de precedencia de operadores
        int resultado = 3 + 4 * 2; //El resultado es 11
        System.out.println("Resultado de 3 + 4 * 2: " + resultado);

        resultado = (3 + 4) * 2; //El resultado es 14
        System.out.println("Resultado de (3 + 4) * 2: " + resultado);

        resultado = 12 / 3 + 2 * 3; //El resultado es 10
        // Primero se evalúa la división 12 / 3, que da 4, luego se evalúa la multiplicación 2 * 3, que da 6, y finalmente se suman los resultados: 4 + 6 = 10
        // Ambos operadores de multiplicación y división tienen la misma precedencia, por lo que se evalúan de izquierda a derecha
        System.out.println("Resultado de 12 / 3 + 2 * 3: " + resultado);


    }
}
