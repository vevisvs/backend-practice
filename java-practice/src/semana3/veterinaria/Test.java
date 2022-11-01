package semana3.veterinaria;

public class Test {
    public static void main(String[] args) {

        Perro firulais = new Perro();

        firulais.setNombre("firulais");
        Duenio vevis = new Duenio("vevis", firulais);

        System.out.println("el nombre de la mascota es: " + vevis.getMascota().getNombre());


    }
}
