package semana2.leccion2;

public class TestPerro {
    public static void main(String[] args) {

        Perro perro = new Perro(2013, true, false, "Pepe");
        perro.calcularEdad(2013, 2022);
        perro.factibleAPerderse(true);
        perro.enAdopcion(false, 5.0);

    }
}
