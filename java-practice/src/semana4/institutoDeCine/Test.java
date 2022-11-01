package semana4.institutoDeCine;

import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Largometraje pelicula1 = new Largometraje(new Cine("Movies", "Rambla Armenia 3414", 250), "El origen", true, false, false, 90, "Leonado Padron", "drama", 50);
        System.out.println("Fecha de filmacion: " + pelicula1.getFechaFilmacion());
        pelicula1.verClasificacion();
        pelicula1.compararSiEsMayor(89);
    }
}
