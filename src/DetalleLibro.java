public class DetalleLibro {
    public static void main (String args[]){
        //Detalle de un libro
        //TIpo objeto siempre se guarda el valor en memoria heap
        String titulo="Cien Años de Soledad";
        //Memoria stack solo  trabaja con tipos primitivos
        int anioPublicacion=1967;
        boolean esDisponible=true;
        double precio=29.99;

        System.out.println("Detalle del Libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("Disponible: " + esDisponible);
        System.out.println("Precio: $" + precio);

        titulo="Don Quijote de la Mancha";
        System.out.println("\nActualización del Título del Libro:");
        System.out.println("Nuevo Título: " + titulo);
    }
}
