package seccion3;

public class Cadenas {
    public static void main(String[] args) {
        System.out.println("Manipulación de Cadenas en Java");
        var cadena1 = "Hola";
        System.out.println("Cadena1= " + cadena1);
        var cadena2 = new String("Mundo");
        System.out.println("Cadena2= " + cadena2);
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("Cadena3= " + cadena3);
        //Cadenas de multilinea o text block (Desde Java 15)
        var cadena4= """
                Esto es una cadena
                de varias líneas
                utilizando text block
                """;
        System.out.println("Cadena4= " + cadena4);

    }
}
