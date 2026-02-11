package seccion2;

public class ReservaHotel {
    public static void main(String[] args) {
        var nombreCliente = "Estefany Torres";
        var diasEstadia = 5;
        var tarifaDiaria = 150.5F;
        var tieneVistaAlMar = true;

        System.out.println("Detalle de la Reserva del Hotel:");
        System.out.println("Nombre del Cliente: " + nombreCliente);
        System.out.println("Días de Estadia: " + diasEstadia);
        System.out.println("Tarifa Diaria: $" + tarifaDiaria);
        System.out.println("¿Tiene Vista al Mar?: " + tieneVistaAlMar);

        //Modificacion de la reserva
        nombreCliente = "Carlos Mendoza";
        diasEstadia = 7;
        tarifaDiaria = 100.0F;
        tieneVistaAlMar = false;

        System.out.println("\nActualización de la Reserva del Hotel:");
        System.out.println("Nombre del Cliente: " + nombreCliente);
        System.out.println("Días de Estadia: " + diasEstadia);
        System.out.println("Tarifa Diaria: $" + tarifaDiaria);
        System.out.println("¿Tiene Vista al Mar?: " + tieneVistaAlMar);


    }
}
