public class ReglasVariables {
    public static void main(String[] args) {
        // Reglas para nombrar variables en Java

        // 1. No pueden comenzar con un número, pero si con una letra, _ o $
        // int 1edad = 25; // Incorrecto
        int edad1 = 25; // Correcto
        int _edad = 30; // Correcto
        int $edad = 35; // Correcto

        // 2. No pueden contener espacios
        // String nombre completo = "Estefany"; // Incorrecto
        String nombreCompleto = "Estefany"; // Correcto (uso de camelCase)

        // 3. No pueden usar caracteres especiales (excepto _ y $)
        // double altura@ = 1.75; // Incorrecto
        double altura_ = 1.75; // Correcto

        // 4. No pueden ser palabras reservadas de Java
        // int class = 10; // Incorrecto
        int numeroClase = 10; // Correcto

        // 5. Las variables son sensibles a mayúsculas y minúsculas
        int edad = 30;
        int Edad = 35; // Diferente de 'edad'

        System.out.println("Edad: " + edad);
        System.out.println("Edad con mayúscula: " + Edad);

        // 6. Buenas prácticas: usar nombres descriptivos y camelCase
        String direccionCasa = "Calle Falsa 123";
        System.out.println("Dirección: " + direccionCasa);

        // 7. No pueden ser duplicadas en el mismo ámbito
        // int edad = 40; // Incorrecto, ya existe una variable 'edad'

        // 8. Se puede usar prefijos o sufijos para mayor claridad si es necesario
        // Ejemplo: is, has, num, str, etc.
        boolean isEstudiante = true;
        System.out.println("¿Es estudiante? " + isEstudiante);

        // 9. No abusar de abreviaciones para mantener la claridad
        String tel = "123456789"; // Menos claro
        String telefono = "123456789"; // Más claro
        System.out.println("Teléfono: " + telefono);
    }
}
