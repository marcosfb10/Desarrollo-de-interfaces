
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alumno
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList();
        Animal A1 = new Perro(4.9, "Tobby");
        Animal A2 = new Oveja(20.0, "Dolly");
        Animal A3 = new Gato(3.2, "Miku");
        Animal A4 = new Perro(5.0, "Trufo");
        Animal A5 = new Oveja(12.0, "Mery");
        Animal A6 = new Gato(2.2, "Cat");
        animal.add(A1);
        animal.add(A2);
        animal.add(A3);
        animal.add(A4);
        animal.add(A5);
        animal.add(A6);
        Iterator<Animal> it = animal.iterator();
        while(it.hasNext()){
            System.out.println(it.next().ruido());
        }

    }
}
