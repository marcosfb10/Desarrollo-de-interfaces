/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

/**
 *
 * @author alumno
 */
public class Montador extends Empleado {

    private int numeroElectrodomesticos = 0;
    private double importePorUnidad = 0.0;

    public Montador(String name, String ape, int numE, double imPU) {
        super(name, ape);
        this.numeroElectrodomesticos = numE;
        this.importePorUnidad = imPU;
    }

    public int getNumeroElectrodomesticos() {
        return numeroElectrodomesticos;
    }

    public double getImportePorUnidad() {
        return importePorUnidad;
    }

    public void setNumeroElectrodomesticos(int nE) {
        this.numeroElectrodomesticos = nE;
    }

    public void setImportePorUnidad(double iPU) {
        this.importePorUnidad = iPU;
    }

    public String toString() {
        return "Montador " + super.toString();
    }

    @Override
    public double salario() {
        double salario = this.importePorUnidad * this.numeroElectrodomesticos;
        return salario;
    }

}
