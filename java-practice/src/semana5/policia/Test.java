package semana5.policia;

public class Test {
    public static void main(String[] args) {

        Larga larga1 = new Larga(new Policia("jose", "fernandez", "123"), 5, 200.0, "asdf", 9, "en uso", true, "para matar", 5);
        Larga larga2 = new Larga(new Policia("jose", "fernandez", "123"), 5, 200.0, "asdf", 9, "en uso", true, "para matar", 4);

        System.out.println(larga1.estaEnCondiciones());
        System.out.println(larga1.compareTo(larga2));

    }
}
