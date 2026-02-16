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

        //Metodo isBlank() (Desde Java 11) para verificar si una cadena está vacía o contiene solo espacios en blanco
        var cadenaVacia = "   ";
        System.out.println("¿La cadena está vacía o contiene solo espacios? " + cadenaVacia.isBlank());

        //Metodo lines() (Desde Java 11) para dividir una cadena en líneas
        var cadenaMultilinea = "Línea 1\nLínea 2\nLínea 3";
        var lineas = cadenaMultilinea.lines().toArray();
        System.out.println("Líneas de la cadena:");
        for (var linea : lineas) {
            System.out.println(linea);
        }

        //Metodo indent() (Desde Java 12) para agregar sangría a cada línea de una cadena
        var cadenaIndentada = cadenaMultilinea.indent(4);
        System.out.println("Cadena con indentación:");
        System.out.println(cadenaIndentada);

        //Metodo transform() (Desde Java 12) para transformar una cadena utilizando una función lambda
        var cadenaTransformada = cadena1.transform(c -> c.toUpperCase());
        System.out.println("Cadena transformada con transform(): " + cadenaTransformada);

        //Metodo describeConstable() (Desde Java 12) para obtener una descripción de la cadena como un Optional
        var descripcion = cadena1.describeConstable();
        System.out.println("Descripción de la cadena con describeConstable(): " + descripcion.orElse("No se pudo describir la cadena"));

        //Metodo indent() con números negativos para eliminar sangría
        var cadenaDesindentada = cadenaIndentada.indent(-4);
        System.out.println("Cadena con desindentación:");
        System.out.println(cadenaDesindentada);

        //Metodo de separar caracteres con split() para dividir una cadena en partes utilizando un delimitador
        var cadenaSplit = "Java,Python,C++,JavaScript";
        var lenguajes = cadenaSplit.split(",");
        System.out.println("Lenguajes de programación:");
        for (var lenguaje : lenguajes) {
            System.out.println(lenguaje);
        }

        //Metodo de comparar cadenas con equals() para verificar si dos cadenas son iguales
        var cadenaA = "Hola";
        var cadenaB = "Hola";
        var cadenaC = new String("Hola");
        System.out.println("¿CadenaA es igual a CadenaB? " + cadenaA.equals(cadenaB)); // true
        System.out.println("¿CadenaA es igual a CadenaC? " + cadenaA.equals(cadenaC)); // true, aunque son objetos diferentes, el contenido es igual


    }
}
