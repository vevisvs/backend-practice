package semana4.institutoDeCine;

import java.util.Date;

public class Corto extends Pelicula{
    private Boolean origenNacional;

    public Corto(Cine cine, String nombrePelicula, Boolean clasifATP, Boolean clasifMenorA13, Boolean clasifMenorA18, Integer duracionEnMin, String nombreDirector, Boolean origenNacional){
        super(cine, nombrePelicula, clasifATP, clasifMenorA13, clasifMenorA18, duracionEnMin, nombreDirector);
        this.origenNacional = origenNacional;
    }

    @Override
    public void verClasificacion() {
        if (super.getClasifATP()) {
            System.out.println("Clasificación: apta para todo público");
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

    public Boolean determinarOrigen(){
        if(this.origenNacional){
            System.out.println("El corto es de origen nacional");
            return true;
        }else{
            System.out.println("El corto es de origen extranjero");
            return false;
        }
    }
}
