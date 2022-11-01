package semana1.leccion2;

/* RECIBIR 3 NUMEROS Y DEVOLVER EL MÁXIMO ENTRE LOS 3 NUMEROS */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros: ");
        System.out.println("Ingrese el primer numero: ");
        Integer numeroUno = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        Integer numeroDos = teclado.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        Integer numeroTres = teclado.nextInt();

        Integer elMayor = 0;

        if (numeroUno > numeroDos && numeroUno > numeroTres) {
            elMayor = numeroUno;
        } else if (numeroDos > numeroUno && numeroDos > numeroTres) {
            elMayor = numeroDos;
        } else {
            elMayor = numeroTres;
        }
        System.out.println("El mayor es el numero: " + elMayor);
    }
}

