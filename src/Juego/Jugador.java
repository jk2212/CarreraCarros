
package Juego;

import Ids.Nombre;
import java.awt.Color;

public class Jugador {

    private Nombre Nombre;
    private Color Color;
    private Integer Puntos;

    public Jugador(Nombre nombre, Color color, Integer puntos) {
        this.Nombre = nombre;
        this.Color = color;
        this.Puntos = puntos;
    }

    public Nombre nombre() {
        return Nombre;
    }

    public Color color() {
        return Color;
    }

    public void asignarPuntos(Integer puntos) {
        Puntos = Puntos;
    }

}
