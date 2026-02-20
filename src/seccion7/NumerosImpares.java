package seccion7;

public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("Numeros impares del 0 al 20");

        var contador=0;

        //Ciclo whilw
//        while(contador<=20){
//            if (contador%2!=0)
//                System.out.print(contador+ "  ");
//            contador++;
//        }
        //Ciclo do while
        do{
            if(contador%2!=0){
                System.out.print(contador+ " ");
            }
            contador++;
        } while(contador<=20);
    }
}
