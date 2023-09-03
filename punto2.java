
package TallerJavaNetbeans;

import javax.swing.JOptionPane;

/**
 *
 * @author SirArthur
 */
public class punto2 {

    public static void main(String[] args) {
        int h, m, t;
        String am ;
        h = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora ;D"));
        m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los minutos ;D"));
        if (h >= 12) {
            t = h - 12;
            am = "PM";
        }else {
            t = h;
            am = "AM";
        }
        JOptionPane.showMessageDialog(null,"La hora es: "+ t + " : "+ m + am);
        JOptionPane.showMessageDialog(null,"La hora militar es: "+ h + " : "+ m + am);
        }
    }
