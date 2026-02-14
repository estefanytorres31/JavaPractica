package seccion3;

public class MasCadenas {
    public static void main(String[] args) {
        //Mas metodos de concatenacion de cadenas
        var nombre = "Estefany";
        var apellido = "Torres";
        var cadena1 = nombre + " " + apellido;
        System.out.println("Cadena concatenada con +: " + cadena1);

        //Metodo concat()
        var cadena2 = nombre.concat(" ").concat(apellido);
        System.out.println("Cadena concatenada con concat(): " + cadena2);

        //StringBuilder para concatenar cadenas de manera eficiente
        var constructor = new StringBuilder();
        constructor.append(nombre);
        constructor.append(" ");
        constructor.append(apellido);
        var resultado = constructor.toString(); //Convierte el StringBuilder a una cadena de texto
        System.out.println("Cadena concatenada con StringBuilder: " + resultado);

        //StringBuffer es similar a StringBuilder pero es thread-safe (seguro para uso en múltiples hilos)
        var constructorBuffer = new StringBuffer();
        constructorBuffer.append(nombre).append(" ").append(apellido);
        var resultadoBuffer = constructorBuffer.toString();
        System.out.println("Cadena concatenada con StringBuffer: " + resultadoBuffer);

        //Metodo join() (Desde Java 8) para concatenar cadenas con un delimitador
        var cadenaJoin = String.join(" ", nombre, apellido, "Adios!");
        System.out.println("Cadena concatenada con String.join(): " + cadenaJoin);

        //Metodo format() para formatear cadenas con placeholders
        var cadenaFormat = String.format("Mi nombre es %s %s", nombre, apellido);
        System.out.println("Cadena formateada con String.format(): " + cadenaFormat);

        //Metodo repeat() (Desde Java 11) para repetir una cadena un número específico de veces
        var cadenaRepeat = "Hola ".repeat(3);
        System.out.println("Cadena repetida con String.repeat(): " + cadenaRepeat);

        //Metodo strip() (Desde Java 11) para eliminar espacios en blanco al inicio y al final de una cadena
        var cadenaConEspacios = "   Hola Mundo   ";
        var cadenaStrip = cadenaConEspacios.strip();
        System.out.println("Cadena con espacios: '" + cadenaConEspacios + "'");
        System.out.println("Cadena sin espacios con strip(): '" + cadenaStrip + "'");
    }
}
