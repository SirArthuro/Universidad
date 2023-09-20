/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg5;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author SirArthur
 */
public class Taller5 {

    
    public static void main(String[] args) {
        
        JTextArea imprimir= new JTextArea(20,20);
        JScrollPane scroll = new JScrollPane(imprimir);
        ArrayList<Persona>listapersonas=new ArrayList();
        ArrayList<Empresa>listae =new ArrayList();
        
        Persona p1 = new Persona();
               
        Direccion  dr2= new Direccion("polombia","plato");
        Direccion dr1=new Direccion("taco taco","afganistan");
        
        Empresa e1 = new Empresa("123","El manduco");
        e1.addSede(dr1);
        e1.addEmpleados(p1);

        
        
        
        
        
       int op=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion\n"+ 
                "1.-)ingresasr datos\n"+
                "2.-)mostrar datos\n"+
                "3.-)salir"));
       
       switch(op){
           case 1:
               p1.setNombre(JOptionPane.showInputDialog("Ingresa el nombre :D"));
               p1.setApellido(JOptionPane.showInputDialog("Ingresa el apellido :D"));
               p1.setCedula(JOptionPane.showInputDialog("ingresa la cedula"));
               p1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad :D")));
               p1.setDomicilio(dr2);
               
           case 2:
               listapersonas.add(p1);
               imprimir.setText("Lista de personas\n");
               imprimir.setText("nombre\t"+"apellido\t"+"cedula\t"+"edad\t"+"direccion\t"+"trabajo\n");
                for (int i=0;i<listapersonas.size();i++){
                    imprimir.append(listapersonas.get(i).getNombre()+"\t"+listapersonas.get(i).getApellido()+"\t"+listapersonas.get(i).getCedula()+"\t"+listapersonas.get(i).getEdad()+"\t"+listapersonas.get(i).getDomicilio()+"\t"+listapersonas.get(i).getTrabajo()+"\n");                   
                }
                listae.add(e1);
                imprimir.setText("Lista de empresas\n");
                imprimir.setText("nombre\t"+"nit\t"+"sedes\t"+"empleados\t"+"sedes\n");
                for(int j=0;j<listae.size();j++){
                    imprimir.append(listae.get(j).getNombre()+"\t"+listae.get(j).getNombre()+"\t"+listae.get(j).getEmpleado()+"\t"+listae.get(j).getSede()+"\n");
                }
                JOptionPane.showMessageDialog(null, scroll);
       }
        
    }
    
}
