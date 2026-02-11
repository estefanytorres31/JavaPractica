package seccion3;

public class InmutabilidadCadenas {
    public static void main(String[] args) {
        //Inmutabilidad de las cadenas
        var cadena = "Hola";
        System.out.println("Cadena original: " + cadena);
        var cadena2 = cadena;
        //Intentamos modificar la cadena
        cadena = "Adiós";
        System.out.println("Cadena modificada: " + cadena);
        System.out.println("Cadena2: " + cadena2);

    }
}
