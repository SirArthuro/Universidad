package TallerJavaNetbeans;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author SirArthur
 */
public class punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int ne, i = 0, tuv = 0, tid = 0,mayor=0,mayorv=0,pos=0;
   
        
        Scanner entrada = new Scanner(System.in);

        ne = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de elementos :D"));
        int[] a = new int[ne];
        int[] b = new int[ne];
        int[] c = new int[ne];
           
                for (i = 0; i < ne; i++) {
                    System.out.println( "Ingrese el codigo del prodcuto numero:("+(i + 1) +") : ");
                    a[i] = entrada.nextInt();
                    System.out.println("Ingrese el valor de la venta: ");
                    b[i] = entrada.nextInt();
                    System.out.println( "Ingrese la cantidad de unidades vendidas: ");
                    c[i] = entrada.nextInt();
                   
                }
            
            
                for (int uv : c) {
                    tuv = tuv + uv;
                }
                
                
                for(i=0;i<b.length;i++){
                    if(b[i]>mayor){
                        mayor=b[i];}
                    }
                
                for(i=0;i<c.length;i++){
                    if(c[i]>mayor){
                        mayorv=c[i];
                        pos+=1;
                        }
                    }
                
                for (int id : b) {
                    tid = tid + id;
                    
                }
                
               
                
    

    System.out.println ("Total productos: " + tuv);
    System.out.println("Total ingresos por ventas: "+tid);
    System.out.println("Mayor venta: "+mayor);
    System.out.println("El producto mas vendido fue el numero: "+a[pos]+"con un total de: "+mayorv+"ventas");
    }
}

