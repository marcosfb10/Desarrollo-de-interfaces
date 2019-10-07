package CP;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alumno
 */
public class TestCP {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        try {
            System.out.println("Introduce un código postal: ");
            int postal = t.nextInt();
            Direccion.setCodigoPostal(postal);
        } catch (BadPostCodeException e) {
            System.out.println("El codigo postal no es correcto");
        }
    }

}
