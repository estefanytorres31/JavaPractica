package seccion3;

public class BusquedaSubcadenas {
    public static void main(String[] args) {
        //Busqueda de subcadenas
        var cadena = "Hola Mundo";
        var subcadena1 = "Mundo";
        var subcadena2 = "mundo";
        var subcadena3 = "Hola";

        //El método indexOf devuelve el indice de la primera ocurrencia de la subcadena, o -1 si no se encuentra
        var indiceSubcadena1 = cadena.indexOf(subcadena1);
        if (indiceSubcadena1 != -1) {
            System.out.println("La subcadena '" + subcadena1 + "' se encuentra en la posición: " + indiceSubcadena1);
        } else {
            System.out.println("La subcadena '" + subcadena1 + "' no se encuentra en la cadena.");
        }

        var indiceSubcadena2 = cadena.indexOf(subcadena2);
        if (indiceSubcadena2 != -1) {
            System.out.println("La subcadena '" + subcadena2 + "' se encuentra en la posición: " + indiceSubcadena2);
        } else {
            System.out.println("La subcadena '" + subcadena2 + "' no se encuentra en la cadena.");
        }

        var indiceSubcadena3 = cadena.indexOf(subcadena3);
        if (indiceSubcadena3 != -1) {
            System.out.println("La subcadena '" + subcadena3 + "' se encuentra en la posición: " + indiceSubcadena3);
        } else {
            System.out.println("La subcadena '" + subcadena3 + "' no se encuentra en la cadena.");
        }


        //lastIndexOf devuelve el indice de la ultima ocurrencia de la subcadena, o -1 si no se encuentra
        var indiceUltimaOcurrencia = cadena.lastIndexOf(subcadena1);
        if (indiceUltimaOcurrencia != -1) {
            System.out.println("La última ocurrencia de la subcadena '" + subcadena1 + "' se encuentra en la posición: " + indiceUltimaOcurrencia);
        } else {
            System.out.println("La subcadena '" + subcadena1 + "' no se encuentra en la cadena.");
        }
    }
}
