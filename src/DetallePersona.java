public class DetallePersona {
    public static void main(String[] args) {
        //Detalle de una persona
        //Tipo objeto siempre se guarda el valor en memoria heap
        String nombre = "Estefany";
        //Memoria stack solo trabaja con tipos primitivos
        int edad = 23;
        String pais = "Perú";
        double altura = 1.57;
        char estadocivil = 'S'; // S para Soltero, C para Casado

        System.out.println("Detalle de la Persona:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("País: " + pais);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Soltero o casado: " + estadocivil);
    }
}
