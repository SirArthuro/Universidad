
package TallerJavaNetbeans;

import javax.swing.JOptionPane;

/**
 *
 * @author SirArthur
 */
public class punto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h;
        double s,i,b;
        s=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario :D"));
        h=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantas horas trabajo :D"));
        
        if(h>=38){
            b=(s*50/100);
        }
            else{ 
            b=0;
        }
        if(s<=750){
            i=0;
            }else{
            i=(s*10/100);   
        }
        s=(s+b)-i;
        
        JOptionPane.showMessageDialog(null,"Su bonificacion es de: "+b);
        JOptionPane.showMessageDialog(null,"Sus impuestos son: "+i );
        JOptionPane.showMessageDialog(null, "Su Salario queda en: "+s);
    }
    
}
