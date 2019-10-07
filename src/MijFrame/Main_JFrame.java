
package MijFrame;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;



/**
 *
 * @author Marcos Flores Barbero
 */
public class Main_JFrame {
    public static void main(String[] args) {
        JFrame j = new PruebajFrame();
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);
        j.setVisible(true);
    }

}
