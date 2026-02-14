package seccion3;

public class GenerarEmail {
    public static void main(String[] args) {
        var nombre = "Estefany Torres Timana";
        var empresa = "PCS";
        var dominio = "com.pe";

        //Generar el email utilizando concatenación
        var emailGenerado = nombre.toLowerCase().replace(" ", ".") + "@" + empresa.toLowerCase() + "." + dominio;

        System.out.println("Nombre usuario: " + nombre);
        System.out.println("Nombre usuario normalizado: " + nombre.toLowerCase().replace(" ", "."));

        System.out.println("\nNombre empresa: " + empresa);
        System.out.println("Nombre empresa normalizado: " + empresa.toLowerCase()+"."+dominio);

        System.out.println("\nEmail generado: " + emailGenerado);
    }
}
