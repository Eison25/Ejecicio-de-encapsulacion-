/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo;

import javax.swing.JOptionPane;

/**
 *
 * @author eison
 */
               // class constructor
public class Empleado {
    // global variables
   private String nombre;
   private short edad;
   private String direccion;
   private long telefono ;

    /**
     * @return the nombre
     */
            //encapsulation of the variables
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public short getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(short edad) {
        this.edad = edad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the nombre
     */
}
