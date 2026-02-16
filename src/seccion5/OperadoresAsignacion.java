package seccion5;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        //Operadores de asignacion
        System.out.println("Operadores de Asignación en Java");
        //Asignación simple
        var numero = 10;
        int numero2;
        numero2= 20;
        System.out.println("Número: " + numero);

        //Asignación compuesta
        // +=
        numero += 5; //equivalente a numero = numero + 5
        System.out.println("Número después de += 5: " + numero);

        // -=, *=, /=, %=
        numero *= 2; //equivalente a numero = numero * 2
        System.out.println("Número después de *= 2: " + numero);

        //Asignaciones de variables multiples
        int a=10, b=15, c=20;
        System.out.printf("Valores iniciales: a=%d, b=%d, c=%d", a, b, c);


    }
}
