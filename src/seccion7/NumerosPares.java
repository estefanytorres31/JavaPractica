package seccion7;

public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("---NUMEROS PARES DEL 1 AL 20---");
        //Inicializamos el contador
        int i= 0;

        //Usamos un ciclo while para iterar del 1 al 20
        while (i <= 20) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }
    }
}
