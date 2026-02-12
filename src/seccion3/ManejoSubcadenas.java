package seccion3;

public class ManejoSubcadenas {
    public static void main(String[] args) {
        //Manejo de subcadenas
        var cadena = "Hola Mundo";
        //El ultimo indice de la cadena es indicada no se incluye en la subcadena
        var subcadena1 = cadena.substring(0, 4); //Recupera "Hola"
        System.out.println("Subcadena 1: " + subcadena1);
        var subcadena2 = cadena.substring(5); //Recupera "Mundo", si no se indica el segundo parametro, se recupera hasta el final de la cadena
        System.out.println("Subcadena 2: " + subcadena2);
    }
}
