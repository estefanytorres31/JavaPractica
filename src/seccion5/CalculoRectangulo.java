package seccion5;

import java.util.Scanner;

public class CalculoRectangulo {
    public static void main(String[] args) {
        System.out.println("Calculo de area y perimetro de un rectangulo");

        var consola = new Scanner(System.in);

        //Solicitamos los datos de base y altura
        System.out.print("Proporciona la base del rectángulo: ");
        var base = Double.parseDouble(consola.nextLine());

        System.out.print("Proporciona la altura del rectángulo: ");
        var altura = Double.parseDouble(consola.nextLine());

        //Calculamos el area y el perimetro
        var resultadoArea = base * altura;
        var resultadoPerimetro = 2 * (base + altura);

        //Mostramos los resultados
        System.out.printf("""
                ---RESULTADOS---
                Área del rectángulo: %.2f
                Perímetro del rectángulo: %.2f
                """, resultadoArea, resultadoPerimetro);
    }
}
