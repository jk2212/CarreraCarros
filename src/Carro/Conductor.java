
package Carro;


public class Conductor {
    private String nombre;

    public Conductor() {
    }

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String nombre() {
        return nombre;

    }

    public Integer lanzarDado() {
        int dadoAleatorio = (int) (Math.random() * 6 + 1);
        return dadoAleatorio;
    }

}
