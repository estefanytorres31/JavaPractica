public class DetalleProducto {
    public static void main(String[] args) {
        //Detalle de un producto
        //Tipo objeto siempre se guarda el valor en memoria heap
        String nombreProducto = "Laptop Lenovo";
        //Memoria stack solo trabaja con tipos primitivos
        int cantidad = 3;
        double precio = 799.99;
        boolean isDisponible = false; // Indica si el producto está disponible

        System.out.println("---- TIENDA PEPITO ----");
        System.out.println("Detalle del Producto:");
        System.out.println("Nombre del Producto: " + nombreProducto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: $" + precio);
        System.out.println("¿Esta disponible?: " + isDisponible);

        // Actualización de la cantidad del producto
        nombreProducto= "Laptop HP";
        cantidad = 10;
        precio = 749.99;
        isDisponible= true;
        System.out.println("\nActualización de la Cantidad del Producto:");
        System.out.println("Nuevo Nombre del Producto: " + nombreProducto);
        System.out.println("Nueva Cantidad: " + cantidad);
        System.out.println("Nuevo Precio: $" + precio);
        System.out.println("¿Esta disponible?: " + isDisponible);
    }
}
