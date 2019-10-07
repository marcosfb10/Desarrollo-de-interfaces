/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public abstract class Animal {

    private double peso = 0;
    private String nombre = "";
    
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double pe) {
        this.peso = pe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public abstract String ruido();

}
