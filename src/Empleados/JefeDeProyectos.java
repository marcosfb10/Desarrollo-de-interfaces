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
public class JefeDeProyectos extends Empleado {

    private double salarioBase = 0.0;
    private int numeroProyectos = 0;
    private final double incentivo = 25.0;

    public JefeDeProyectos(String name, String ape, double salB, int numP) {
        super(name, ape);
        this.salarioBase = salB;
        this.numeroProyectos = numP;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getNumeroProyectos() {
        return numeroProyectos;
    }

    public void setSalarioBase(double sB) {
        this.salarioBase = sB;
    }

    public void setNumeroProyectos(int nP) {
        this.numeroProyectos = nP;
    }

    public String toString() {        
        return "Jefe de Proyectos "+ super.toString();
    }

    @Override
    public double salario() {
        double sal = this.salarioBase + (this.incentivo * this.numeroProyectos);
        return sal;
    }

}
