
package Datos;

import Juego.Jugador;


public class Podio implements Props {

    private Jugador primerLugar;
    private Jugador segundoLugar;
    private Jugador tercerLugar;

    public Podio() {
    }

    public void asignarPrimerLugar(Jugador jugador) {
        primerLugar = jugador;
    }

    public void asignarSegundoLugar(Jugador jugador) {
        segundoLugar = jugador;
    }

    public void asignarTercerLugar(Jugador jugador) {
        tercerLugar = jugador;
    }

    @Override
    public Jugador primerLugar() {
        return primerLugar;
    }

    @Override
    public Jugador segundoLugar() {
        return segundoLugar;
    }

    @Override
    public Jugador tercerLugar() {
        return tercerLugar;
    }

    @Override
    public Boolean estaLleno() {
        Boolean lleno = false;
        if (primerLugar != null && segundoLugar != null && tercerLugar != null) {
            lleno = true;
        }
        return lleno;
    }

}
