package seccion6;

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("Operador Ternario en Java");
        //Sintaxis: condicion ? valor_si_verdadero : valor_si_falso
        //¿Que pasa si hay 2 condicionees y un falso? Se pueden anidar operadores ternarios

        //Determinar si un número es par o impar
        var numero = 5;
        var resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número " + numero + " es: " + resultado);

        //Calcular si es mayor de edad
        var edad = 20;
        var esMayorDeEdad = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("\nLa persona con edad " + edad + " es: " + esMayorDeEdad);

        //Saber si un valor es positivo, negativo o cero
        numero = 4;
        //Anidando operadores ternarios
        //Estructura: condicion ? valor_si_verdadero : (condicion2 ? valor_si_verdadero2 : valor_si_falso2)
        resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        System.out.println("\nEl valor " + numero + " es: " + resultado);


    }
}
