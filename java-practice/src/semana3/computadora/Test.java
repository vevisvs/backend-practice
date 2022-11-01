package semana3.computadora;

public class Test {
    public static void main(String[] args) {
        Ram adata = new Ram("adatargb", 2.4);
        Procesador ryzen = new Procesador("amd", "3700X", 4.4);
        DiscoRigido western = new DiscoRigido("westernDigital", 1.0, 7200);
        Computadora compuVevis = new Computadora("asus", "gamer", "2018", western, ryzen, adata);


        System.out.println(compuVevis.verMarca());

    }
}
