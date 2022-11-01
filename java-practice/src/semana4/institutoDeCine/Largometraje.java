package semana4.institutoDeCine;

import java.util.Date;

public class Largometraje extends Pelicula {
    private String tema;
    private Integer cantActoresPrincipales;

    public Largometraje(Cine cine, String nombrePelicula, Boolean clasifATP, Boolean clasifMenorA13, Boolean clasifMenorA18, Integer duracionEnMin, String nombreDirector, String tema, Integer cantActoresPrincipales){
        super(cine, nombrePelicula, clasifATP, clasifMenorA13, clasifMenorA18, duracionEnMin, nombreDirector);
        this.tema = tema;
        this.cantActoresPrincipales = cantActoresPrincipales;
    }

    public Integer getCantActoresPrincipales(){
        return this.cantActoresPrincipales;
    }

    public void setCantActoresPrincipales(){
        this.cantActoresPrincipales = cantActoresPrincipales;
    }

    public String getTema(){
        return this.tema;
    }

    public void setTema(){
        this.tema = tema;
    }


    @Override
    public void verClasificacion() {
        if (super.getClasifATP()) {
            System.out.println("Clasificacion: apta para todo publico");
        }else{
            if(super.getClasifMenorA13()){
                System.out.println("Clasificacion: apta para menores de 13 anos");
            }else{
                if(super.getClasifMenorA18()){
                    System.out.println("Clasificacion: apta para menores de 18 años");
                }
            }
        }
    }

    public void compararSiEsMayor(Integer cantActoresDeOtraPeli){
       if(this.cantActoresPrincipales > cantActoresDeOtraPeli){
           System.out.println("El largometraje " + getTema() + " es mayor");
       }else if(this.cantActoresPrincipales < cantActoresDeOtraPeli){
           System.out.println("El largometraje " + super.getNombre() + " es menor");
       }else{
           System.out.println("Ambos tienen la misma cantidad de actores principales");
       }
    }
}
