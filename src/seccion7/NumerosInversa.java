package seccion7;

public class NumerosInversa {
    public static void main(String[] args) {
        System.out.println("Numeros de 10 a 1 en orden inverso");

        //Usando un ciclo do-while
        var contador = 10;
        do {
            System.out.print(contador + " ");
            contador--;
        } while (contador>=1);

//        //Usando un ciclo while
//        while (contador>=1){
//            System.out.print(contador);
//            contador--;
//        }
    }
}
