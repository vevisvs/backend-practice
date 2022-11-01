package semana4.institutoDeCine;

import java.util.Date;

public abstract class Pelicula {
    private Cine cine;
    private String nombre;
    private Boolean clasifATP;
    private Boolean clasifMenorA13;
    private Boolean clasifMenorA18;
    private Integer duracionEnMin;
    private Date fechaFilmacion;
    private String nombreDirector;

    public Pelicula(Cine cine, String nombre, Boolean clasifATP, Boolean clasifMenorA13, Boolean clasifMenorA18, Integer duracionEnMin, String nombreDirector){
        this.cine = cine;
        this.nombre = nombre;
        this.clasifATP = clasifATP;
        this.clasifMenorA13 = clasifMenorA13;
        this.clasifMenorA18 = clasifMenorA18;
        this.duracionEnMin = duracionEnMin;
        this.nombreDirector = nombreDirector;
    }

    public Cine getCine() {
        return this.cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getClasifATP() {
        return clasifATP;
    }

    public void setClasifATP(Boolean clasifATP) {
        this.clasifATP = clasifATP;
    }

    public Boolean getClasifMenorA13() {
        return clasifMenorA13;
    }

    public void setClasifMenorA13(Boolean clasifMenorA13) {
        this.clasifMenorA13 = clasifMenorA13;
    }

    public Boolean getClasifMenorA18() {
        return clasifMenorA18;
    }

    public void setClasifMenorA18(Boolean clasifMenorA18) {
        this.clasifMenorA18 = clasifMenorA18;
    }

    public Integer getDuracionEnMin() {
        return duracionEnMin;
    }

    public void setDuracionEnMin(Integer duracionEnMin) {
        this.duracionEnMin = duracionEnMin;
    }

    public Date getFechaFilmacion() {
        return fechaFilmacion;
    }

    public void setFechaFilmacion(Date fechaFilmacion) {
        this.fechaFilmacion = fechaFilmacion;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public abstract void verClasificacion();
}
