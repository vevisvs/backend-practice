package semana2.leccion2;
/* codificar en JAVA la clase impresora */
public class TestImpresora {
    public static void main(String[] args) {

        Impresora impresora = new Impresora();
        System.out.println("esta encendida: " + impresora.isEncendida());
        impresora.encender();
        System.out.println("esta encendida: " + impresora.isEncendida());
        System.out.println("cantidad de hojas: " + impresora.getCantHojas());

        impresora.cargarHojas(10);
        System.out.println("cantidad de hojas: " + impresora.getCantHojas());

        impresora.imprimir("Bienvenidos a la segunda semana de POO", 1);

    }
}
