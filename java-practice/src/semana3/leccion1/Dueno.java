package semana3.leccion1;

public class Dueno {
    //atributos:
    private String nombre;
    private String numeroCta;
    private Perro perro;

    //constructor:

    public Dueno(String nombre, Perro perro){
        this.nombre = nombre;
        this.perro = perro;
    }

    //metodo
    public void pagarServicio(Double monto){
        System.out.println("se le cobran: " + monto);
    }
}
