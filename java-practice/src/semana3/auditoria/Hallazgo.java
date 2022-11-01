package semana3.auditoria;

import java.util.Calendar;

public class Hallazgo {
    //atributos:
    private String areaCompania;
    private Calendar fechaEncontrado;
    private Boolean tiene5Compromisos;
    private Boolean estadoCritico;
    private Boolean encontrado;
    private Compromiso compromiso;


    //constructor
    public Hallazgo(String areaCompania, Boolean tiene5Compromisos, Boolean estadoCritico) {
        this.areaCompania = areaCompania;
        this.fechaEncontrado = fechaEncontrado;
        this.tiene5Compromisos = tiene5Compromisos;
        this.estadoCritico = estadoCritico;
    }

    //getters y setters:

    public String getAreaCompania() {
        return areaCompania;
    }

    public Calendar getFechaEncontrado() {
        return fechaEncontrado;
    }

    public Boolean getTiene5Compromisos() {
        return tiene5Compromisos;
    }

    public Boolean getEstadoCritico() {
        return estadoCritico;
    }

    public Boolean getEncontrado() {
        return encontrado;
    }

    public void setAreaCompania(String areaCompania) {
        this.areaCompania = areaCompania;
    }

    public void setFechaEncontrado(Calendar fechaEncontrado) {
        this.fechaEncontrado = fechaEncontrado;
    }

    public void setTiene5Compromisos(Boolean tiene5Compromisos) {
        this.tiene5Compromisos = tiene5Compromisos;
    }

    public void setEstadoCritico(Boolean estadoCritico) {
        this.estadoCritico = estadoCritico;
    }

    public void setEncontrado(Boolean encontrado) {
        this.encontrado = encontrado;
    }

    //metodos:
    public Boolean levantarHallazgo(){
        if(this.encontrado != null && this.encontrado == true && this.estadoCritico == true && this.tiene5Compromisos == true){
            System.out.println("Hallazgo levantado");
            return true;
        }
        System.out.println("Necesita agregar mas informacion para poder levantar su hallazgo");
        return false;
    }


}
