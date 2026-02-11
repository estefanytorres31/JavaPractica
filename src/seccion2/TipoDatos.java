package seccion2;

public class TipoDatos {
    public static void main(String[] args) {
        //Tipos de datos
        //Enteros (Valores sin decimales, por default 0)
        byte numeroByte = 127; //1 byte
        System.out.println("numeroByte = " + numeroByte);

        short numeroShort = 32767; //2 bytes
        System.out.println("numeroShort = " + numeroShort);

        int numeroInt = 2147483647; //4 bytes
        System.out.println("numeroInt = " + numeroInt);

        long numeroLong = 9223372036854775807L; //8 bytes
        System.out.println("numeroLong = " + numeroLong);

        //Punto flotante (Valores con decimales, por default 0.0)
        float numeroFloat = 3.4028235E38F; //4 bytes se debe indicar con F al final
        System.out.println("numeroFloat = " + numeroFloat);

        double numeroDouble = 1.7976931348623157E308; //8 bytes se puede indicar con D al final pero no es obligatorio
        System.out.println("numeroDouble = " + numeroDouble);

        //Caracter (1 solo caracter, por default '\u0000')
        char caracter = 'A'; //2 bytes juego unicode
        System.out.println("caracter = " + caracter);
        caracter = 65; //Valor numérico del caracter 'A'
        System.out.println("caracter = " + caracter);
        caracter='@';
        System.out.println("caracter = " + caracter);

        //Booleano (Valores true o false, por default false)
        boolean booleano = true; //1 bit
        System.out.println("booleano = " + booleano);
        booleano = false;
        System.out.println("booleano = " + booleano);

        //Tipos de referencia (Objetos, por default null)
        String nombre= null; //ausencia de referencia de un objeto
        System.out.println("nombre = " + nombre);
        nombre="Estefany";
        System.out.println("nombre = " + nombre);
    }
}
