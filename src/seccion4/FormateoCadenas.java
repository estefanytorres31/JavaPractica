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


        //Metodo printf (print format) : Imprime directamente el mensaje formateado en la consola
        System.out.printf("Mi nombre es %s, tengo %d años y mi salario es %.2f%n", nombre, edad, salario); //%n para nueva línea

        //Formateo con text block
        var codigoEmpleado = 15;
        mensaje= """
                %nDetalle Persona: \s
                -----------------
                \tCódigo Empleado: %d
                \tNombre: %s
                \tEdad: %d
                \tSalario: %.2f
                """.formatted(codigoEmpleado, nombre, edad, salario);
        System.out.println(mensaje);

        //Formateo de texto block y printf
        System.out.printf("""
                %nDetalle Persona: \s
                -----------------
                \tCódigo Empleado: %04d
                \tNombre: %s
                \tEdad: %d
                \tSalario: %.2f
                """, codigoEmpleado, nombre, edad, salario);
    }
}
