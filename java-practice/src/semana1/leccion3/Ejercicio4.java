package semana1.leccion3;

/* Implementar un programa que nos permite mostrar por consola los primeros “n” números primeros, siendo “n” un valor
numérico ingresado por consola. Por ejemplo: Con n=7, lo que debería devolver el programa es “Los primeros 7 números
primos son: 2, 3, 5, 7, 11, 13, 17”. */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        /*Integer limiteMinimo = 1;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero que indique la cantidad del numeros primos que desea ver en pantalla: ");
        Integer limiteMaximo = teclado.nextInt();

        for(int i = limiteMinimo; i <= limiteMaximo; i++){
            int esPrimo = 0;
            for(int j = 1; j <= i/2; j++){
                if(i % j == 0){
                    esPrimo += 2;
                }
                if(esPrimo > 2){
                    break;
                }
            }
            if(esPrimo == 2){
                System.out.println(i);
            }
        }*/


       Scanner teclado = new Scanner(System.in);
       //Integer n, x, num, contador;

        System.out.println("Ingresa un numero: ");
        Integer n = teclado.nextInt();

        Integer num = 0;

        while(n > 0){
            num = num + 1;
            Integer x = 1;
            Integer contador = 0;

            while(x <= num){
                if(num % x == 0){
                    contador = contador + 1;
                }
                x = x + 1;
            }
            if(contador == 2){

            }
        }
    }
}


