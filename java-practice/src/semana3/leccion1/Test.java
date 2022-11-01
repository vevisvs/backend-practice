package semana3.leccion1;

public class Test {
    public static void main(String[] args) {

        Perro ozzi = new Perro("Ozzi");
        Dueno jose = new Dueno("Jose", ozzi);

        Perro kibbi = new Perro("Kibbi");
        Dueno marta = new Dueno("Marta", kibbi);

    }
}
