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
public class Pacifista extends Aldeano {
    private String discurso;

    public Pacifista(String discurso, String nombre, String apellido, int edad, int puntosVida) {
        super(nombre, apellido, edad, puntosVida);
        this.discurso = discurso;
    }

    public String getDiscurso() {
        return discurso;
    }

    public void setDiscurso(String discurso) {
        this.discurso = discurso;
    }

    @Override
    public String toString() {
        return "Pacifista{"+ "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", puntosVida=" + puntosVida + "discurso=" + discurso + '}';
    }
    
    
    
}
