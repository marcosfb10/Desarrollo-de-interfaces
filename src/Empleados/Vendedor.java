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
public class Vendedor extends Empleado {

    private int electrodomesticosVendidos = 0;
    private double comision = 0.0;
    private double salarioBase = 0.0;

    public Vendedor(String name, String ape, int elecV, double comi, double salB) {
        super(name, ape);
        this.electrodomesticosVendidos = elecV;
        this.comision = comi;
        this.salarioBase = salB;
    }

    public int getElectrodomesticosVendidos() {
        return electrodomesticosVendidos;
    }

    public double getComision() {
        return comision;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setElectrodomesticosVendidos(int eV) {
        this.electrodomesticosVendidos = eV;
    }

    public void setComision(double com) {
        this.comision = com;
    }

    public void setSalarioBase(double sB) {
        this.salarioBase = sB;
    }

    public String toString() {
        return "Vendedor " + super.toString();
    }

    @Override
    public double salario() {
        double salario = this.salarioBase + (this.comision * this.electrodomesticosVendidos);
        return salario;
    }

}
