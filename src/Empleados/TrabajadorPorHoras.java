/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

/**
 *
 * @author Marcos Flores Barbero
 */
public class TrabajadorPorHoras extends Empleado {

    private int numeroHorasTrabajadas = 0;
    private double salarioPorHora = 0.0;

    public TrabajadorPorHoras(String name, String ape, int numHT, double salPH) {
        super(name, ape);
        this.numeroHorasTrabajadas = numHT;
        this.salarioPorHora = salPH;
    }

    public int getNumeroHorasTrabajadas() {
        return numeroHorasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setNumeroHorasTrabajadas(int nHT) {
        this.numeroHorasTrabajadas = nHT;
    }

    public void setSalarioPorHora(double sPH) {
        this.salarioPorHora = sPH;
    }

    public String toString() {
        return "Trabajador por horas " + super.toString();
    }

    @Override
    public double salario() {
        double sal = this.numeroHorasTrabajadas * this.salarioPorHora;
        return sal;
    }

}
