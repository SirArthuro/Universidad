/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg5;

import java.util.ArrayList;

/**
 *
 * @author SirArthur
 */
public class Empresa {
    private String nit;
    private String nombre;
    private ArrayList<Persona> empleado;
    private ArrayList<Direccion> sede;

    public Empresa() {
        this.empleado =  new ArrayList();
        this.sede = new ArrayList();
    }
    
    

    public Empresa(String nit, String nombre ) {
        this.nit = nit;
        this.nombre = nombre;
        this.empleado =  new ArrayList();
        this.sede = new ArrayList();
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Persona> empleado) {
        this.empleado = empleado;
    }

    public ArrayList<Direccion> getSede() {
        return sede;
    }

    public void setSede(ArrayList<Direccion> sede) {
        this.sede = sede;
    }
 
    public void addEmpleados(Persona p){
        this.empleado.add(p);
    }
    public void addSede(Direccion d){
        this.sede.add(d);
    }
    
}
    