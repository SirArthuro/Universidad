/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TallerJavaNetbeans;

/**
 *
 * @author SirArthur
 */
public class punto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 50;
        int b = 120;
        int mcd = maximoComunDivisor(a, b);
        System.out.printf("El MCD de %d y %d es %d\n", a, b, mcd);
        int mcdRecursivo = maximoComunDivisorRecursivo(a, b);
        System.out.printf("El MCD de %d y %d (con recursividad) es %d\n", a, b, mcdRecursivo);
    }

    public static int maximoComunDivisor(int a, int b) {
        int temporal;//Para no perder b
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    public static int maximoComunDivisorRecursivo(int a, int b) {
        if (b == 0) return a;
        return maximoComunDivisorRecursivo(b, a % b);
    }
       
        
    }

