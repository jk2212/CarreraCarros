
package Datos;


public class Pista implements Values {

    public Pista(Integer kilometros, Integer numeroDeCarriles) {
        this.kilometros = kilometros;
        this.numeroDeCarriles = numeroDeCarriles;
    }

    private Integer kilometros;
    private Integer numeroDeCarriles;

    @Override
    public Integer kilometros() {
        return kilometros;
    }

    @Override
    public Integer numeroDeCarriles() {
        return numeroDeCarriles;
    }

}
