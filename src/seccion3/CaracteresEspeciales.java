package seccion3;

public class CaracteresEspeciales {
    public static void main(String[] args) {
        //Caracteres especiales
        // \n: salto de línea
        var cadena1 = "Hola\nMundo";
        System.out.println("Cadena con salto de línea: " + cadena1);

        // \t: tabulación
        var cadena2 = "\tHola\tMundo";
        System.out.println("Cadena con tabulación: " + cadena2);

        // \\: barra invertida
        var cadena3 = "Ruta de archivo: C:\\Users\\Usuario";
        System.out.println("Cadena con barra invertida: " + cadena3);

        // \": comillas dobles
        var cadena4 = "Ella dijo: \"Hola Mundo\"";
        System.out.println("Cadena con comillas dobles: " + cadena4);

        // \': comillas simples
        var cadena5 = "Es un carácter de comilla simple: \'";
        System.out.println("Cadena con comillas simples: " + cadena5);

        // \r: retorno de carro
        var cadena6 = "Hola Mundo\rAdiós";
        System.out.println("Cadena con retorno de carro: " + cadena6);
    }
}
