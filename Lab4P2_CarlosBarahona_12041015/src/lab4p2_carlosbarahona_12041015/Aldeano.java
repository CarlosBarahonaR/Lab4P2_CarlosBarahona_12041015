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
public class Aldeano {
    public String nombre;
    public String apellido;
    public int edad;
    public int puntosVida;

    public Aldeano(String nombre, String apellido, int edad, int puntosVida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.puntosVida = puntosVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    @Override
    public String toString() {
        return "Aldeano{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", puntosVida=" + puntosVida + '}';
    }
    
    
    
    
}
