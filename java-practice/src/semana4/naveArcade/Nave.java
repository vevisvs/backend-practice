package semana4.naveArcade;

import java.util.Scanner;

public class Nave extends Objeto {
    private Double velocidad;
    private Integer vida = 100;


    public Nave(Integer posX, Integer posY, String direccion, Double velocidad, Integer vida) {
        super(posX, posY, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }


    public Double getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad() {
        this.velocidad = velocidad;
    }

    public Integer getVida(){
        return this.vida;
    }

    public void setVida(Integer vida){
        this.vida = vida;
    }


    @Override
    public String irA() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Establezca la direccion de destino: ");
        String movimientoPedido = scanner.nextLine();
        System.out.println("Direccion establecida al: " + movimientoPedido);
        return movimientoPedido;
    }

    public void girar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Deseas cambiar la direccion de la nave? (si / no)");
        String cambio = teclado.nextLine();
        if(cambio == "si"){
            System.out.println("¿Hacia donde quieres ir?");
            String movimiento = teclado.nextLine();
            if (movimiento == "norte") {
                    System.out.println("Sin cambios. Nos dirigimos al norte");
                } else {
                    System.out.println("La nave se encuentra en direccion contraria, retomando direccion hacia el norte");
                };
            if (movimiento == "sur") {
                    System.out.println("Sin cambios. Nos dirigimos al sur");
                } else {
                    System.out.println("La nave se encuentra en direccion contraria, retomando direccion hacia el sur");
                };
            if (movimiento == "este") {
                    System.out.println("Sin cambios. Nos dirigimos al este");
                } else {
                    System.out.println("La nave se encuentra en direccion contraria, retomando direccion hacia el este");
                };
            if (movimiento == "oeste") {
                    System.out.println("Sin cambios. Nos dirigimos al oeste");
                } else {
                    System.out.println("La nave se encuentra en direccion contraria, retomando direccion hacia el oeste");
                };
        }else{
            System.out.println("Perfecto. continuamos en la misma direccion");
        }

    }

    public Integer restaVida(Integer lesion){
        vida = this.vida - lesion;
        System.out.println("La nave ha sido atacada. Vida total: " + vida + "%");
        return vida;

    }
}
