package seccion2;

public class ConstanteJava {
    public static void main(String[] args) {
        //Definición de una constante en Java

        //final + tipo de dato + nombre de la constante (en mayúsculas por convención) + = + valor;
        final double PI = 3.1416;
        final String SALUDO = "¡Hola, Mundo!";
        final int EDAD_MINIMA = 18; //Se separa en mayúsculas con guion bajo si es necesario
        final var VALOR_IMMUTABLE = 42; //Uso de var con final para definir una constante

        System.out.println("Valor de la constante PI: " + PI);
        System.out.println("Math.PI: " + Math.PI);
        System.out.println(SALUDO);
        System.out.println("Edad mínima para votar: " + EDAD_MINIMA + " años");
        System.out.println("Valor inmutable definido con var: " + VALOR_IMMUTABLE);
    }
}
