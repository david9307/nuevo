/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal_data;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Personal_data {
private String edad,nombre,apellido,numced,direccion;
private Scanner leer;    

  



    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
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

    public String getNumced() {
        return numced;
    }

    public void setNumced(String numced) {
        this.numced = numced;
    }



public void LoadindgData(){
leer=new Scanner(System.in);
    System.out.println("Ingrese el nombre");
    nombre=leer.next();
    System.out.println("Ingrese el apellido");
    apellido=leer.next();
    System.out.println("Ingrese la edad");
    edad=leer.next();
    System.out.println("Ingrese el numero de cedula");
    numced=leer.next();
    System.out.println("Ingrese la direccion");
    direccion=leer.next();
}


public void show_data(){
  System.out.println("nombre "+nombre);
  System.out.println("apellido "+apellido);
  System.out.println("edad "+edad+" años");
  System.out.println("cedula "+numced);
   System.out.println("direccion "+direccion);
}
    
    /**
     * @param args the command line arguments
     */
    
    
}
