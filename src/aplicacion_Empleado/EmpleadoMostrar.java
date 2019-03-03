/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_Empleado;

import Trabajo.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author eison
 */
public class EmpleadoMostrar {
    
    public static void main(String[] args) {
        String desea;
        int menu;
        
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();
        Empleado empleado4 = new Empleado();
        Empleado empleado5 = new Empleado();
        
   empleado1.setNombre(JOptionPane.showInputDialog("Digite el nombre del primer Empleado: ")) ;  
   empleado1.setEdad(Short.parseShort(JOptionPane.showInputDialog("Digite la edad del primer Empleado: "))) ; 
   empleado1.setDireccion(JOptionPane.showInputDialog("Digite la direccion del primer Empleado: ")) ;  
   empleado1.setTelefono(Long.parseLong(JOptionPane.showInputDialog("Digite el telefono del primer Empleado: "))) ;  
   
   empleado2.setNombre(JOptionPane.showInputDialog("Digite el nombre del segundo Empleado: ")) ;  
   empleado2.setEdad(Short.parseShort(JOptionPane.showInputDialog("Digite la edad del segundo  Empleado: "))) ; 
   empleado2.setDireccion(JOptionPane.showInputDialog("Digite la direccion del segundo  Empleado: ")) ;  
   empleado2.setTelefono(Long.parseLong(JOptionPane.showInputDialog("Digite el telefono del segundo  Empleado: "))) ;  
  
   empleado3.setNombre(JOptionPane.showInputDialog("Digite el nombre del tercer Empleado: ")) ;  
   empleado3.setEdad(Short.parseShort(JOptionPane.showInputDialog("Digite la edad del tercer Empleado: "))) ; 
   empleado3.setDireccion(JOptionPane.showInputDialog("Digite la direccion del tercer Empleado: ")) ;  
   empleado3.setTelefono(Long.parseLong(JOptionPane.showInputDialog("Digite el telefono del tercer Empleado: "))) ;  
   
   empleado4.setNombre(JOptionPane.showInputDialog("Digite el nombre del cuarto Empleado: ")) ;  
   empleado4.setEdad(Short.parseShort(JOptionPane.showInputDialog("Digite la edad del cuarto Empleado: "))) ; 
   empleado4.setDireccion(JOptionPane.showInputDialog("Digite la direccion del cuarto Empleado: ")) ;  
   empleado4.setTelefono(Long.parseLong(JOptionPane.showInputDialog("Digite el telefono del cuarto Empleado: "))) ;  
   
   empleado5.setNombre(JOptionPane.showInputDialog("Digite el nombre del Quinto Empleado: ")) ;  
   empleado5.setEdad(Short.parseShort(JOptionPane.showInputDialog("Digite la edad del Quinto  Empleado: "))) ; 
   empleado5.setDireccion(JOptionPane.showInputDialog("Digite la direccion del Quinto  Empleado: ")) ;  
   empleado5.setTelefono(Long.parseLong(JOptionPane.showInputDialog("Digite el telefono del Quinto  Empleado: "))) ;  
       

do {       
        menu=Integer.parseInt(JOptionPane.showInputDialog("Este menu es para los empleados, digite un numero para ver la informacion de cada uno: \n 1.Empleado1 \n 2.Empleado2 \n 3.Empleado3 \n 4.Empleado4 \n 5.Empleado5  "));
        
        switch(menu){
            case 1:
                JOptionPane.showMessageDialog(null," Nombre: "+empleado1.getNombre()+"\n  Edad: "+empleado1.getEdad()+"\n  Direccion: "+empleado1.getDireccion()+"\n  Telefono: "+empleado1.getTelefono());
            break;
            case 2:
               JOptionPane.showMessageDialog(null," Nombre: "+empleado2.getNombre()+"\n  Edad: "+empleado2.getEdad()+"\n  Direccion: "+empleado2.getDireccion()+"\n  Telefono: "+empleado2.getTelefono());
            break;
            case 3:
               JOptionPane.showMessageDialog(null," Nombre: "+empleado3.getNombre()+"\n  Edad: "+empleado3.getEdad()+"\n  Direccion: "+empleado3.getDireccion()+"\n  Telefono: "+empleado3.getTelefono());
            break;
            case 4:
               JOptionPane.showMessageDialog(null," Nombre: "+empleado4.getNombre()+"\n  Edad: "+empleado4.getEdad()+"\n  Direccion: "+empleado4.getDireccion()+"\n  Telefono: "+empleado4.getTelefono());
            break;
            case 5:
               JOptionPane.showMessageDialog(null," Nombre:" +empleado5.getNombre()+"\n  Edad: "+empleado5.getEdad()+"\n  Direccion: "+empleado5.getDireccion()+"\n  Telefono: "+empleado5.getTelefono());
            break;
        }
        
        desea=(JOptionPane.showInputDialog("desea esoger otro Empleado (s/n)"));
        }while(desea.equalsIgnoreCase("s"));
    }
}

