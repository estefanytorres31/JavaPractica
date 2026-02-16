package seccion5;

public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("Operadores unarios");
        int a = 3, b = -2, resultado;
        var c = true;

        //Operador unario +
        resultado = +a;
        System.out.println("Operador unario +: " + resultado);

        //Operador unario -
        resultado = -a;
        System.out.println("Operador unario -: " + resultado);

        //Operador unario incremento y decremento
        //Preincremento
        a = 3;
        resultado = ++a;
        System.out.println("Preincremento: " + resultado); //Primero incrementa a y luego asigna a resultado
        System.out.println("a después del preincremento: " + a);

        //Postincremento
        a = 3;
        resultado = a++; //Primero se usa el valor y despues se incrementa
        System.out.println("Postincremento: " + resultado); //Primero asigna a resultado y luego incrementa a
        System.out.println("a después del postincremento: " + a);

        b= -2;
        resultado = --b; //Primero decrementa b y luego asigna a resultado
        System.out.println("Predecremento: " + resultado); //Primero decrementa b y luego asigna a resultado
        System.out.println("b después del predecremento: " + b);

        b= -2;
        resultado = b--; //Primero se usa el valor y despues se decrementa
        System.out.println("Postdecremento: " + resultado); //Primero asigna a resultado y luego decrementa b
        System.out.println("b después del postdecremento: " + b);

    }
}
