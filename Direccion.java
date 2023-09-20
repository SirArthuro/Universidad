/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg5;

/**
 *
 * @author SirArthur
 */
public class Direccion {
    private String pais;
    private String ciudad;

    public Direccion() {
    }

    public Direccion(String pais, String ciudad) {
        this.pais = pais;
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return  "pais=" + pais + ", ciudad=" + ciudad ;
    }
    
    
}
