package seccion4;

public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("Formateo de Cadenas en Java");
        var nombre = "Estefany";
        var edad = 21;
        var salario = 2500.50;

        // Formateo utilizando String.format
        // %s para cadenas, %d para enteros, %.2f para decimales con 2 dígitos
        var mensaje = String.format("Mi nombre es %s, tengo %d años y mi salario es %.2f", nombre, edad, salario);
        System.out.println(mensaje);
    }
}
