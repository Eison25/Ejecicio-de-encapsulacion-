/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_Empleado;
// we call the main class
import Trabajo.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author eison
 */
public class EmpleadoMostrar {
    
      public static void main(String[] args) {
        //the variable of the 5 employees are created to fill with the data that the user requests
        //the data of the user of the 5 employees
        String desea;
        int menu; 
        Empleado empleado1 = new Empleado("Cesar Rodriguez",18,"calle 25 # 8-52" , 313452800);
        Empleado empleado2 = new Empleado("Camilo Paez",21,"calle 26 # 7-89", 32102302);
        Empleado empleado3 = new Empleado("Diego Cobos",22,"Carrera 23 #22-60", 321908326);
        Empleado empleado4 = new Empleado("David Parrado",18,"calle 28 # 6-12", 310251469);
        Empleado empleado5 = new Empleado("Tomas Navarrete",21, "calle 15 # 58-2",312564826);
       
       
   // we make a menu for the employee to look at your data and we ask you question that if you want to read the data of another employee 
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

