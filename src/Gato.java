/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Gato extends Animal{
    public Gato(double peso, String nombre) {
        setPeso(peso);
        setNombre(nombre);
    }
    /**
     * 
     * @return 
     */
    public String ruido(){
        String sound = "El gato "+getNombre()+ " maulla, y pesa "+getPeso()+" kg";
        return sound;
    }
}
