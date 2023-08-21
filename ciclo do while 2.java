
package ciclos;
import java.util.Scanner;

public class ciclos  {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i=1,contador;
        
        System.out.println("Escriba la cantidad de numeros: ");
        contador = entrada.nextInt();
        
        do{
            System.out.println(i);
            i++;
            
        }while(i<=contador);
    }
    
}
