package semana1.leccion1;

/* Ejercitacion STRING */
/* Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un mensaje.  */

public class Ejercicio1 {
    public static void main(String[] args) {

        String nombre = "Vevis";
        String nombre2 = "Vevis";

        if (nombre.equals(nombre2)) {
            System.out.println("Las cadenas de texto son iguales");
        } else {
            System.out.println("Las cadenas de texto no son iguales");
        }
        System.out.println(esDivisible(4,2));

    }
    /* Hacer una función que reciba como parámetro dos valores y devuelva un boolean. La función debe comprobar si el
    primer número es divisible por el segundo. Ejemplo: boolean esDivisible(int n, int divisor) */

    private static boolean esDivisible(int numero, int divisor) {
        if (numero % 2 == 0) {
            return false;
        } else{
            return true;
        }
    }
}




