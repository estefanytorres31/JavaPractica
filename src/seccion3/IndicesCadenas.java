package seccion3;

public class IndicesCadenas {
    public static void main(String[] args) {
        //Manejo de indices en cadenas
        var cadena = "Hola Mundo";

        var primerCaracter = cadena.charAt(0); //Recupera el primer caracter
        System.out.println("Primer caracter: " + primerCaracter);
        var ultimoCaracter = cadena.charAt(9); //Recupera el ultimo caracter
        System.out.println("Ultimo caracter: " + ultimoCaracter);
        var letraM = cadena.charAt(5); //Recupera el sexto caracter
        System.out.println("Letra: " + letraM);
    }
}
