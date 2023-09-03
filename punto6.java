/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TallerJavaNetbeans;

import javax.swing.JOptionPane;

/**
 *
 * @author SirArthur
 */
public class punto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double a,b,c,A,C;
       a=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer cateo:D"));
       b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo cateo:D"));
       
       c = Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
       A = Math.asin(a/c);
       C = Math.asin(b/c);
       C = Math.toDegrees(C);
       A = Math.toDegrees(A);
       JOptionPane.showMessageDialog(null, "La hipotenusa es: "+c);
       JOptionPane.showInputDialog("Los angulos son: "+A+" y "+C);
    }
    
}
