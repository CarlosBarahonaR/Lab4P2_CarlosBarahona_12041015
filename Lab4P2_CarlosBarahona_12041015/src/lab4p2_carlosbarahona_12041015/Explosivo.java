/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_carlosbarahona_12041015;

/**
 *
 * @author Admin
 */
public class Explosivo extends Aldeano {

    private final int ataque = 250;

    public Explosivo(String nombre, String apellido, int edad, int puntosVida) {
        super(nombre, apellido, edad, puntosVida);
    }

    public int getAtaque() {
        return ataque;
    }

    @Override
    public String toString() {
        return "Explosivo{"+ "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", puntosVida=" + puntosVida + "ataque=" + ataque + '}';
    }

}
