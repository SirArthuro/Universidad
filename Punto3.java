
package TallerJavaNetbeans;

import javax.swing.JOptionPane;

/**
 *
 * @author SirArthur
 */
public class Punto3 {
    public static void main(String[] args) {
          int a ;
          double b;
    a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el termino :D"));
    b=a/ Math.pow(2,a);
    JOptionPane.showMessageDialog(null,"La suma de los terminos es: "+ b);
    }
  
}
