/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal_data;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class cliente extends Personal_data {
     private double saldo=0;
     private Scanner leer2;
     private String prueba;
     
     
     
     
     public void Actualizar_datos(){
     leer2=new Scanner(System.in);
   
    System.out.println("Ingrese la edad");
    setEdad(leer2.next());
    System.out.println("Ingrese la direccion");
    setDireccion(leer2.next());
    
    }
     
     
    public void consignacion(double sald){
    saldo=saldo+sald;
    }
    
    
    public void retiro(double sald){
    if(saldo>sald){
    saldo=saldo-sald;
    
    }
    else{
    System.out.println("Dinero insuficiente");
    }
    
    }
    
     
    public void consultar_saldo(){
    
    System.out.println("Su saldo es"+saldo);
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0,sel,m=0,reg=-1,vacio=0;
        String comp;
        Scanner leer=new Scanner(System.in);
      
        ArrayList<cliente> clvec = new ArrayList<>();

        
        while(i!=1){
  System.out.println("Ingrese la opcion a la que quiere acceder");
  System.out.println("1. Ingresar usuario");
  System.out.println("2. Actualizar datos de usuario");
  System.out.println("3. consignar");
  System.out.println("4. retirar");
  System.out.println("5. consultar saldo ");
  System.out.println("6. Ver informacion del usuario ");
  System.out.println("7. borrar usuario");
  System.out.println("8. Salir");
  sel=leer.nextInt();
    
   switch(sel){
   
       case 1:
      cliente cl=new cliente();
      cl.LoadindgData();
      clvec.add(cl);
     
       break;
       
       case 2:
      System.out.println("Ingrese su cedula");
      comp=leer.next();
      for(int n=0;n<clvec.size();n++){
       if (comp.equals(clvec.get(n).getNumced())){
       reg=n;
       
       }
      }
      
       if (reg==-1){
       System.out.println("Usted no esta en esta base de datos");
       }
       
       else{
       clvec.get(reg).Actualizar_datos();
       reg=-1;
       }
        break;
        
         case 3:
      System.out.println("Ingrese la cedula de la cuenta a la que va a consignar");
      comp=leer.next();
      for(int n=0;n<clvec.size();n++){
        if(comp.equals(clvec.get(n).getNumced())){
      reg=n;
        }
      }
      if (reg==-1){
      System.out.println("la cuenta a la que desea consignar no existe");
      }
      else{
      System.out.println("Cuanto desea consignar");
      clvec.get(reg).consignacion(leer.nextDouble());
      reg=-1;
      }
       break;
       
        case 4:
            
        System.out.println("Ingrese la cedula para retirar dinero");
      comp=leer.next();
      for(int n=0;n<clvec.size();n++){
        if(comp.equals(clvec.get(n).getNumced())){
      reg=n;
        }
      }
      if (reg==-1){
      System.out.println("cuenta invalida");
      }
      else{
      System.out.println("Cuanto desea retirar");
      clvec.get(reg).retiro(leer.nextDouble());
      reg=-1;
      }
       break;
       
       
      
       
        case 5:
             System.out.println("Ingrese la cedula para verificar dinero en su "
                     + "cuenta");
      comp=leer.next();
      for(int n=0;n<clvec.size();n++){
        if(comp.equals(clvec.get(n).getNumced())){
      reg=n;
        }
      }
      if (reg==-1){
      System.out.println("cuenta invalida");
      }
      else{
      
      clvec.get(reg).consultar_saldo();
      reg=-1;
      }
       
       break;
        
       
       case 6:
     // clvec.get(0).show_data();
      //clvec.get(1).show_data();
       for (int n=0;n<clvec.size();n++){
       clvec.get(n).show_data();
      
       }
       if(clvec.isEmpty()){
       System.out.println("No existe una base de datos");
       }
       break;
       
       case 7:
        System.out.println("Ingrese la cedula del usuario que desea borrar");
      comp=leer.next();
      for(int n=0;n<clvec.size();n++){
       if (comp.equals(clvec.get(n).getNumced())){
       reg=n;
       
       }
      }
      
       if (reg==-1){
       System.out.println("Este usuario no esta en esta base de datos");
       }
       
       else{
       clvec.remove(reg);
       System.out.println("El usuario ha sido borrado");
       reg=-1;
       }
        break;
        
       
       
       case 8:
       i=1;
   }
        
    }
    
  }
}