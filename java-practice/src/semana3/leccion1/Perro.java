package semana3.leccion1;

public class Perro {
    //atributos:
    private String identificacion;
    private String nombre;
    private String raza;

    //constructor
    public Perro(String nombre){
        this.nombre = nombre;
    }

    //metodos:
    public void ladrar(){
        System.out.println("woof, woof");
    }
}
