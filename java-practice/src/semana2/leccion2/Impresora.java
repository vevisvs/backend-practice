package semana2.leccion2;

import java.util.Calendar;

public class Impresora {

    //atributos
    private String modelo;
    private Boolean conexionInalambrica;
    private Calendar fechaFabricacion;
    private Integer cantHojas;
    private Boolean encendida;


    //constructor
    public Impresora(){
        cantHojas = 0;
        this.encendida = false;
    }

    public Impresora(Integer cantHojas){
        this.cantHojas = cantHojas;
        this.encendida = false;
    }

    //metodos
    public void encender(){
        this.encendida = true;
    }

    public void apagar(){
        this.encendida = false;
    }

    public void cargarHojas(Integer cantHojas){

    }

    public Boolean imprimir(String texto, Integer cantHojas){
        if(!this.encendida){
            System.out.println("Impresora apagada");
            return false;
        }
        if(this.cantHojas > cantHojas){
            System.out.println("No hay hojas");
            return false;
        }
        System.out.println("Su impresion: " + texto);
        this.cantHojas -= cantHojas;
        return true;
    }

    // getters y setters
    public Boolean isEncendida(){
        return this.encendida;
    }

    public Integer getCantHojas(){
        return this.cantHojas;
    }

}
