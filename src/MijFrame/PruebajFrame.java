package MijFrame;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;


/**
 *
 * @author Marcos Flores Barbero
 */
public class PruebajFrame extends javax.swing.JFrame {

    public PruebajFrame() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize(); 
        this.setTitle("Ejemplo JFrame");
        this.setSize(d.width / 2, d.height / 2);
        this.setLocationRelativeTo(null);
       
        Image icono = tk.getImage("descarga.jpg");
        this.setIconImage(icono);

    }

}
