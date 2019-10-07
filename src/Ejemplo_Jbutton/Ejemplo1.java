/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Jbutton;


import java.awt.Font;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Marcos Flores Barbero
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        int size = 50;
        JFrame j = new JFrame("Ejemplo boton");
        JTextField texto = new JTextField("Ejemplo de cambio de tipo de fuente");
        //Relativo al jFrame
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setSize(400, 400);
        j.setLayout(null);
        j.setLocationRelativeTo(null);
        //Imagen en el boton
        ImageIcon icono = new ImageIcon("Descarga.png");
        ImageIcon iconoEscala = new ImageIcon(icono.getImage().getScaledInstance(size, size, java.awt.Image.SCALE_DEFAULT));
        //Creacion jButton
        JButton bt1 = new JButton(iconoEscala);
        //Localizacion de los componentes
        bt1.setBounds(40, 40, 50, 50);
        texto.setBounds(100, 40, 240, 50);
        //Cambio la fuente del jTextField
        Font font = new Font("Courier", Font.BOLD, 12);
        texto.setFont(font);
        
        //Añado componentes al jframe
        j.add(bt1);
        j.add(texto);
        j.setVisible(true);
    }
}
