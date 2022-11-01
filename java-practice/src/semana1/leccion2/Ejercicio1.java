package semana1.leccion2;

/* Ingresa tu nombre y apellido por separado. A partir de estas variables, obtener en una tercera tu iniciales
*  y tu fecha de nacimiento, para la fecha considerar 3 valores: dia, mes y año.
* Luego,  muestra un mensaje, como si fuera una ficha, con tus datos completos. */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese el dia de su nacimiento");
        Integer diaNacimiento = teclado.nextInt();
        System.out.println("Ingrese su mes nacimiento: ");
        Integer mesNacimiento = teclado.nextInt();
        System.out.println("Ingrese su ano de nacimiento: ");
        Integer anoNacimiento = teclado.nextInt();

        System.out.println("Hola " + " " + nombre + " " + apellido);
        System.out.println("Tu ficha medica es la siquiente: ");

        System.out.println("*****************************************");
        System.out.println("*************FICHA MEDICA****************");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Iniciales: " + nombre.charAt(0) + apellido.charAt(0));
        System.out.println("fecha de nacimiento: " + diaNacimiento + "-" + mesNacimiento + "-" + anoNacimiento);
        System.out.println("*****************************************");
        System.out.println("*****************************************");
        }

    }










