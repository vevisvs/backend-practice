package semana1.leccion3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //creacion de variables
        int contadorJugadorUno = 0;
        int contadorJugadorDos = 0;
        int numeroRondas = 0;

        //Creamos el array de opciones de respuesta y lo inicializamos, cargando espacio en memoria
        String opciones [];
        opciones = new String [3];

        //Cargamos datos al array
        opciones[0] = "Piedra";
        opciones[1] = "Papel";
        opciones[2] = "Tijera";

        //Solicitar nombres a los jugadores a traves del metodo scanner y guarda las respuestas en variables
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del jugador # 1: ");
        String jugadorUno = teclado.nextLine();
        System.out.println("Nombre del jugador # 2: ");
        String jugadorDos = teclado.nextLine();

        //Solicitar respuesta a jugadores
       // Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador 1. Elije tu respuesta: 1 = Piedra, 2 = Papel, 3 = Tijera");
        Integer respJugadorUno = teclado.nextInt();
        System.out.println("Jugador 2. Elije tu respuesta: 1 = Piedra, 2 = Papel, 3 = Tijera");
        Integer respJugadorDos = teclado.nextInt();

        //Visualizar respuestas de ambos jugadores
        System.out.println("El jugador 1 selecciono: " + opciones[respJugadorUno - 1]);
        System.out.println("El jugador 2 selecciono: " + opciones[respJugadorDos - 1]);

        //Logica del juego
       /* switch (respJugadorUno){
            case "Piedra":
                if(respJugadorDos == 1){
                    System.out.println("Empate");
                    break;
                }else if(respJugadorDos == 2){
                    contadorJugadorDos++;
                    System.out.println("Punto para el jugador 2");
                    break;
                }else{
                    contadorJugadorUno++;
                    System.out.println("Punto para el jugador 1");
                    break;
                }
            case "Papel":
                if(respJugadorDos == 2){
                    System.out.println("Empate");
                    break;
                }else if(respJugadorDos == 1){
                    contadorJugadorUno++;
                    System.out.println("Punto para el jugador 1");
                    break;
                }else{
                    contadorJugadorDos++;
                    System.out.println("Punto para el jugador 2");
                    break;
                }
            case "Tijera":
                if(respJugadorDos == 3){
                    System.out.println("Empate");
                    break;
                }else if(respJugadorDos == 2){
                    contadorJugadorUno++;
                    System.out.println("Punto para el jugador 1");
                }else{
                    contadorJugadorDos++;
                    System.out.println("Punto para el jugador 2");
                } */
        }


    }

