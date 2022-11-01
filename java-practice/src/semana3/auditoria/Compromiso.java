package semana3.auditoria;

import java.util.Calendar;

public class Compromiso {
    //atributos:
    private String descripcion;
    private String nombreResponsable;
    private String apellidoResponsable;
    private Calendar fechaDeCompromiso;

    //constructor:
    public Compromiso(String descripcion, String nombreResponsable, String apellidoResponsable, Calendar fechaDeCompromiso){
        this.descripcion = descripcion;
        this.nombreResponsable = nombreResponsable;
        this.apellidoResponsable = apellidoResponsable;
        this.fechaDeCompromiso = fechaDeCompromiso;
    }

    //getters y setters:

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getApellidoResponsable() {
        return apellidoResponsable;
    }

    public void setApellidoResponsable(String apellidoResponsable) {
        this.apellidoResponsable = apellidoResponsable;
    }

    public Calendar getFechaDeCompromiso() {
        return fechaDeCompromiso;
    }

    public void setFechaDeCompromiso(Calendar fechaDeCompromiso) {
        this.fechaDeCompromiso = fechaDeCompromiso;
    }
}
