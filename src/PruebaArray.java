
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class PruebaArray {
    public static void main(String[] args) {
        
        int[] array = new int[5];
        try{
        System.out.println(array[5]);
        }catch(Exception e){
            System.out.println("Fallo debido a que se ha superado el indice del array");
        }
    }
}
