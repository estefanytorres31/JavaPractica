package seccion3;

public class MetodosCadenas {
    public static void main(String[] args) {
        //Uso de métodos en cadenas
        var cadena = "Hola Mundo";

        var longitud = cadena.length(); //Obtiene la longitud de la cadena
        System.out.println("Longitud: " + longitud);

        var mayusculas = cadena.toUpperCase(); //Convierte a mayúsculas
        System.out.println("Mayúsculas: " + mayusculas);

        var minusculas = cadena.toLowerCase(); //Convierte a minúsculas
        System.out.println("Minúsculas: " + minusculas);

        var nuevaCadena=cadena.replace('o', 'a'); //Reemplaza caracteres
        System.out.println("Cadena con reemplazo: " + nuevaCadena);

        var cadenaConEspacios = "   Hola Mundo   ";
        var cadenaSinEspacios = cadenaConEspacios.trim(); //Elimina espacios en blanco del inicio y final de la cadena
        System.out.println("Cadena con espacios: '" + cadenaConEspacios + "'");
        System.out.println("Cadena sin espacios: '" + cadenaSinEspacios + "'");


    }
}
