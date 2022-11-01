package semana1.leccion3;

/* En la veterinaria tienen perros de diferentes tipos. Cada uno de ellos come una cantidad fija de alimento balanceado
por día. El proveedor de alimentos le envía un pack con diferentes cantidades de alimento. En cada uno hay sobres con
pequeñas raciones para que se consuman por cada día, sabiendo que deben darles por lo menos 3 kg por día para que
cada perro no se sienta con hambre y ladre toda la noche.
Precisamos hacer un programa que nos ayude a simular la situación: Pedirá primero el nombre y la cantidad de comida que
come el perro. La idea es que mediante una función llamada cuantosPaquetes indique el nombre y cuantos paquetes usará.
Dada la cantidad necesaria la función cuantosPaquetes pedirá uno a uno los pesos de cada paquete hasta llegar a esa
cantidad y retorna el número de paquetes que precisó.
Ejemplo:
Rintintin come 4 kg diarios.
paquetes : 1.2 0.7 1.1 1.3 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del perro: ");
        String nombrePerro = teclado.nextLine();
        System.out.println("Ingrese la cantidad de alimento que consume a diario: ");
        Integer cantidadComida = teclado.nextInt();

        System.out.println("Nombre del perro: " + nombrePerro);
        System.out.println("Cantidad de comida diaria a consumir: " + cantidadComida + "kg");
    }

    double cuantosPaquetes(String nombrePerro, Integer cantidadComida, Integer cantidadPaquetes){

        Integer acumulador = 0;

        Double paquetes [];
        paquetes = new Double [4];

        paquetes[0] = 1.2;
        paquetes[1] = 0.7;
        paquetes[2] = 1.1;
        paquetes[3] = 1.3;

        for( int i = 0; i < paquetes.length; i++){
            if(cantidadComida <= cantidadPaquetes){
                acumulador++;
            }

        }
        return acumulador;


    }


}
