package seccion3;

public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparación de cadenas (pool de cadenas)
        var cadena1 = "Hola";
        var cadena2 = "Hola";
        var cadena3 = new String("Hola");

        //Comparación con el operador == (compara referencias)
        System.out.println("Cadena1 == Cadena2: " + (cadena1 == cadena2)); //true, porque ambas referencias apuntan al mismo objeto en el pool de cadenas
        System.out.println("Cadena1 == Cadena3: " + (cadena1 == cadena3)); //false, porque cadena3 es un nuevo objeto en memoria

        //Comparación con el método equals (compara contenido)
        System.out.println("Cadena1.equals(Cadena2): " + cadena1.equals(cadena2)); //true, porque el contenido es el mismo
        System.out.println("Cadena1.equals(Cadena3): " + cadena1.equals(cadena3)); //true, porque el contenido es el mismo
    }
}
