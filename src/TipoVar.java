public class TipoVar {
    public static void main(String[] args) {
        System.out.println("----Uso de var en Java----");
        //Sin var
        String nombre = "Estefany";
        System.out.println("nombre = " + nombre);

        //Con var
        var nombre2 = "Estefany"; //El tipo de dato se infiere como String por el valor asignado
        System.out.println("nombre2 = " + nombre2);

        //Definir otra variable con var
        var edad = 23; //El tipo de dato se infiere como int por el valor asignado
        System.out.println("edad = " + edad);

        var sueldo = 2500.5F; //El tipo de dato se infiere como float por el sufijo 'F'
        System.out.println("sueldo = " + sueldo);

        var esCasado = false; //El tipo de dato se infiere como boolean por el valor asignado
        esCasado = true; //Se puede reasignar un nuevo valor del mismo tipo
        // esCasado = "No"; //Error de compilación, no se puede asignar un valor de tipo String a una variable de tipo boolean
        System.out.println("esCasado = " + esCasado);

        //Se debe definir el valor
        // var ciudad; //Error de compilación, no se puede usar var sin asignar un valor inicial

        //Se debe poder inferir el tipo de dato
        // var numero = null; //Error de compilación, no se puede inferir el tipo de dato a partir de un valor null




    }
}
