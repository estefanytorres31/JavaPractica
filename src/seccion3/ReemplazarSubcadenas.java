package seccion3;

public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        //Reemplazo de subcadenas
        var cadena = "Hola Mundo";
        System.out.println("Cadena original: " + cadena);
        var nuevaCadena = cadena.replace("Mundo", "Java");
        System.out.println("Cadena modificada: " + nuevaCadena);
        nuevaCadena=cadena.replace("Hola", "Adiós");
        System.out.println("Cadena modificada: " + nuevaCadena);
    }
}
