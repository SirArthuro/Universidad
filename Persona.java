/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg5;

import java.time.LocalDate;

/**
 *
 * @author SirArthur
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private Direccion domicilio;
    private Empresa trabajo;
    private LocalDate fecha;

    public Persona() {
    }

    
    public Persona(String nombre, String apellido, String cedula, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
    }
    
    

    public Persona(String nombre, String apellido, String cedula, int edad, Direccion domicilio, Empresa trabajo,LocalDate fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.domicilio = domicilio;
        this.trabajo = trabajo;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

    public Empresa getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(Empresa trabajo) {
        this.trabajo = trabajo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        String datos= "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", edad=" + edad + ", domicilio=" + domicilio.toString() + ", trabajo=" + trabajo.getNombre() + ", fecha=" + fecha + '}';
        return datos;
    }
    
   
}
   