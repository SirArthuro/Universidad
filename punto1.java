
package TallerJavaNetbeans;

import javax.swing.JOptionPane;

/**
 *
 * @author SirArthur
 */
public class punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double a,b;
     a = Double.parseDouble(JOptionPane.showInputDialog("Digite la base :D"));
     b = Double.parseDouble(JOptionPane.showInputDialog("Digite la altura :D"));
     JOptionPane.showMessageDialog(null,"El area es: "+(a*b));
        
    }
    
}
