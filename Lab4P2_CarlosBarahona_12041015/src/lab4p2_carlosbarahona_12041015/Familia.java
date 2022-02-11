/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_carlosbarahona_12041015;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Familia {
    private String apellido;
    private ArrayList<Aldeano> aldeano;

    public Familia(String apellido, ArrayList<Aldeano> aldeano) {
        this.apellido = apellido;
        this.aldeano = aldeano;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Aldeano> getAldeano() {
        return aldeano;
    }

    public void setAldeano(ArrayList<Aldeano> aldeano) {
        this.aldeano = aldeano;
    }

    @Override
    public String toString() {
        return "Familia{" + "apellido=" + apellido + ", aldeano=" + aldeano + '}';
    }
    
    
    
}
