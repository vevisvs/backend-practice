package semana1.leccion2;

/* DADO UN NUMERO, INDICAR SI ESE NUMERO ES PRIMO O NO */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        Integer numero = teclado.nextInt();

        System.out.println(esPrimo(numero));
    }
    private static boolean esPrimo(Integer numero){
        for (int i = 2; i < numero; i++){
            if((numero % i) == 0) {
                return false;
            }

        } return true;
    }
}
