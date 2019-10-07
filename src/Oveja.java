/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Oveja extends Animal {

    public Oveja(double peso, String nombre) {
        setPeso(peso);
        setNombre(nombre);
    }

    /**
     *
     * @return
     */
    public String ruido() {
        String sound = "La oveja " + getNombre() + " bala, y pesa "+getPeso()+" kg";
        return sound;
    }
}
