/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Perro extends Animal{

    public Perro(double peso, String nombre) {
        setPeso(peso);
        setNombre(nombre);
    }

    /**
     *
     * @return
     */
    @Override
    public String ruido() {
        String sound = "El perro "+getNombre()+" ladra, y pesa "+getPeso()+" kg";
        return sound;
    }
}
