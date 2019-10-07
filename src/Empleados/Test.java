/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

import java.util.ArrayList;

/**
 *
 * @author Marcos Flores Barbero
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList();
        Empleado E1 = new JefeDeProyectos("Pedro", "García", 1205, 5);
        Empleado E2 = new JefeDeProyectos("Raúl", "Pérez", 1150, 4);
        Empleado E3 = new JefeDeProyectos("David", "Bermejo", 1300, 7);
        Empleado E4 = new Montador("Pedro", "García", 15, 75);
        Empleado E5 = new Montador("Raúl", "Pérez", 5, 55);
        Empleado E6 = new Montador("David", "Bermejo", 13, 78);
        Empleado E7 = new TrabajadorPorHoras("Pedro", "García", 8, 10);
        Empleado E8 = new TrabajadorPorHoras("Raúl", "Pérez", 5, 5.5);
        Empleado E9 = new TrabajadorPorHoras("David", "Bermejo", 10, 8.5);
        Empleado E10 = new Vendedor("Pedro", "García", 8, 10,1200);
        Empleado E11 = new Vendedor("Raúl", "Pérez", 4, 20.5,1000);
        Empleado E12= new Vendedor("David", "Bermejo", 10, 18.5, 950);
        
        empleados.add(E1);
        empleados.add(E2);
        empleados.add(E3);
        empleados.add(E4);
        empleados.add(E5);
        empleados.add(E6);
        empleados.add(E7);
        empleados.add(E8);
        empleados.add(E9);
        empleados.add(E10);
        empleados.add(E11);
        empleados.add(E12);
        
        for(Empleado p : empleados){
            System.out.println(p.toString());
            System.out.println("Sueldo del empleado: "+p.salario()+"€");
            
        }
        
    }
}
