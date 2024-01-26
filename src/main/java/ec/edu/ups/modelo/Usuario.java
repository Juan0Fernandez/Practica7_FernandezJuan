/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class Usuario extends Persona implements Serializable{

    private String correo;

    ArrayList<Prestamo> listaPrestamos = new ArrayList<>();

    public Usuario(String correo) {
        this.correo = correo;
    }

    public Usuario( String identificacion, String nombre, String apellido,String correo) {
        super(identificacion, nombre, apellido);
        this.correo = correo;
    }

   
    
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Información del Usuario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Correo: " + correo);
        System.out.println("Lista de préstamos:");
        for (Prestamo prestamo : listaPrestamos) {
            System.out.println(prestamo);
        }
    }
}
