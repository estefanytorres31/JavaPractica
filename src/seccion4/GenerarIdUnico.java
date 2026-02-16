package seccion4;


import java.util.Random;
import java.util.Scanner;

public class GenerarIdUnico {
    public static void main(String[] args) {
        //Pasos:
        //Solicitar nombre, pellido y año de nacimiento
        //Generar aleatoriamente un número entre 1 y 9999, si el nro es menos se debe completar conceros a la izquierda, por ejemplo: 0001, 0234, 9999
        //Agarramos las 2 primeras letras de nombre y apellido
        //Agarramos los 2 ultimos digitos del año de nacimiento
        //Concatenamos las partes para generar el ID único

        //1ra forma
        System.out.println("Generación de ID único en Java");
        //Inicializamos scanner y random
        var consola= new Scanner(System.in);
        var random = new Random();

        //Solicitamos el nombre al usuario
        System.out.print("Ingrese su nombre: ");
        var nombre = consola.nextLine();

        //Solicitamos el apellido al usuario
        System.out.print("Ingrese su apellido: ");
        var apellido = consola.nextLine();

        //Solicitamos el año de nacimiento al usuario
        System.out.print("Ingrese su año de nacimiento: ");
        var anioNacimiento =consola.nextLine();

        //Generamos un número aleatorio entre 1 y 9999
        var numeroAleatorio = random.nextInt(9999) + 1; //El método nextInt(9999) genera un número entre 0 y 9998, por eso se le suma 1

        //Seleccionamos las 2 primeras letras del nombre y apellido, y los 2 últimos dígitos del año de nacimiento
        var primerCaracterNombre = nombre.toUpperCase().charAt(0);
        var segundoCaracterNombre = nombre.toUpperCase().charAt(1);
        var primerCaracterApellido = apellido.toUpperCase().charAt(0);
        var segundoCaracterApellido = apellido.toUpperCase().charAt(1);
        var ultimosDosDigitosAnio = anioNacimiento.substring(2); //Obtenemos los 2 últimos caracteres del año de nacimiento
        //Generamos el ID único concatenando las partes
        var idUnico = String.format("%c%c%c%c%s%04d", primerCaracterNombre, segundoCaracterNombre, primerCaracterApellido, segundoCaracterApellido, ultimosDosDigitosAnio, numeroAleatorio); //%02d para formatear el año con 2 dígitos y %04d para formatear el número aleatorio con 4

        System.out.printf("""
                Hola %s,
                    Tu nuevo número de identificacion generado por el sistema es:
                    %s
                    Felicidades!
                %n""", nombre, idUnico);

        //2da forma
//        var nombreDosCaracteres = nombre.trim().toUpperCase().substring(0,2); //Obtenemos las 2 primeras letras del nombre, eliminando espacios en blanco y convirtiendo a mayúsculas
//        var apellidoDosCaracteres = apellido.trim().toUpperCase().substring(0,2); //Obtenemos las 2 primeras letras del apellido, eliminando espacios en blanco y convirtiendo a mayúsculas
//        var anioNacimientoDosDigitos = anioNacimiento.trim().substring(2); //Obtenemos los 2 últimos dígitos del año de nacimiento, eliminando espacios en blanco
//        var numeroAleatorioFormateado = String.format("%04d", numeroAleatorio); //Formateamos el número aleatorio con 4 dígitos, completando con ceros a la izquierda si es necesario
//        var idUnicoRandom = nombreDosCaracteres + apellidoDosCaracteres + anioNacimientoDosDigitos + numeroAleatorioFormateado; //Concatenamos las partes para generar el ID único
//
//        //Generamos el ID único concatenando las partes
//        System.out.printf("""
//                Hola %s,
//                    Tu nuevo número de identificacion generado por el sistema es:
//                    %s
//                    Felicidades!
//                %n""", nombre, idUnicoRandom);

    }
}
