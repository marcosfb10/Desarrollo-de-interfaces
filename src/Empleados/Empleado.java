/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

import javax.swing.DefaultListModel;

/**
 *
 * @author Marcos Flores Barbero
 */
public abstract class Empleado {

    public static DefaultListModel modeloLista = new DefaultListModel();
    private String nombre = "";
    private String apellidos = "";

    public Empleado(String name, String ape) {
        this.nombre = name;
        this.apellidos = ape;
        modeloLista.addElement(this);

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String toString() {

        return this.nombre + " " + this.apellidos;
    }

    public abstract double salario();

}
