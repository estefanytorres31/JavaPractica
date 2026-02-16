package seccion5;

public class OperadorLogico {
    public static void main(String[] args) {
        System.out.println("Operadores Lógicos en Java");
        //Operadores
        boolean a=true, b=false;
        //AND (&&)
        // x | y | x && y
        // 0 | 0 | 0
        // 0 | 1 | 0
        // 1 | 0 | 0
        // 1 | 1 | 1
        //En Java, true se representa como 1 y false como 0
        var resultado=a && b;
        System.out.println("Resultado AND: " + resultado);

        //OR (||) pipe
        // x | y | x || y
        // 0 | 0 | 0
        // 0 | 1 | 1
        // 1 | 0 | 1
        // 1 | 1 | 1
        //En Java, true se representa como 1 y false como 0
        resultado=a || b;
        System.out.println("Resultado OR: " + resultado);

        //NOT (!)
        // x | !x
        // 0 | 1
        // 1 | 0
        //En Java, true se representa como 1 y false como 0
        resultado=!a;
        System.out.println("Resultado NOT: " + resultado);

    }
}
