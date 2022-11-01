package semana3.computadora;

import java.util.Calendar;

public class Computadora {
    //atributos:
    private String marca;
    private String modelo;
    private String anoFabricacion;
    private Boolean estaEncendida = false;
    private DiscoRigido discoRigido;
    private Procesador procesador;
    private Ram ram;

    //constructor
    public Computadora(String marca, String modelo, String anoFabricacion, DiscoRigido discoRigido, Procesador procesador, Ram ram){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
        this.discoRigido = discoRigido;
        this.procesador = procesador;
        this.ram = ram;
    }

    //metodos
    public void encender() {
        if (estaEncendida == false) {
            this.estaEncendida = true;
        }
    }

    public void apagar() {
        if (estaEncendida == true) {
            this.estaEncendida = false;
        }
    }

    public String verMarca(){
        return this.marca;
    }

    /*public Double accederAAlmacenamientoDeInfo(){
        return DiscoRigido.almacenarInfo();
    }*/
}
