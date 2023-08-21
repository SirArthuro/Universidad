/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author SirArthur
 el siguiente codigo utiliza el ciclo do-while con el fin de realizar la tabla de multiplicar del numero deseado
 */
public class multi {
    
    public static void main(String[] args) throws IOException {
        Scanner enter = new Scanner(System.in);
        
        int mult = 1;
        int numero = 0;
        
        System.out.println("numero que desea ver su tabla: ");
        numero = enter.nextInt();
        
        do{
            System.out.println(numero +"+"+ mult + "=>"+mult*numero); 
            mult++;
        }while(mult<=10);
    }
    
    
}
