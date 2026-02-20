package seccion7;

public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("Suma Acumulativa en Java");

        final var VALOR_MAXIMO=5;

        var acumulador=0;
        var contador=1;

        //Ciclo while para sumar los números del 1 al VALOR_MAXIMO
        //Iterar valores
        while (contador<=VALOR_MAXIMO){
            System.out.println("(acumulador, contador) = (" + acumulador + ", " + contador + ")");
            //Primero se suma el contador al acumulador y luego se incrementa el contador
            acumulador+=contador; //Acumulador = acumulador + contador
            contador++; //contador = contador + 1
            System.out.println("Suma parcial: " + acumulador);
        }
        System.out.println("La suma acumulativa de los números del 1 al " + VALOR_MAXIMO + " es: " + acumulador);

        //Ciclo for para sumar los números del 1 al VALOR_MAXIMO
        acumulador=0; //Reiniciamos el acumulador para la siguiente suma
        contador=1; //Reiniciamos el contador para la siguiente suma

        for (contador=1 ; contador<=VALOR_MAXIMO; contador++) {
            acumulador+=contador; //Acumulador = acumulador + contador
            System.out.println("(acumulador, contador) = (" + acumulador + ", " + contador + ")");
            System.out.println("Suma parcial: " + acumulador);
        }
        System.out.println("La suma acumulativa de los números del 1 al " + VALOR_MAXIMO + " es: " + acumulador);

        //Ciclo do-while para sumar los números del 1 al VALOR_MAXIMO
        acumulador=0; //Reiniciamos el acumulador para la siguiente suma
        contador=1; //Reiniciamos el contador para la siguiente suma

        do {
            acumulador+=contador;
            contador++;
            System.out.println("(acumulador, contador) = (" + acumulador + ", ");
            System.out.println("Suma parcial: " + acumulador);
        } while(contador<=VALOR_MAXIMO);
        System.out.println("La suma acumulativa de los números del 1 al " + VALOR_MAXIMO + " es: " + acumulador);



    }
}
