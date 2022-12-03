
package cola;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import jdk.internal.instrumentation.Logger;

public class Cola {

    private static void atender_caja1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void atender_caja2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void atender_caja3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void cerrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        Clasecola nueva = null;
      Clasecola cola = new  Clasecola ();
      Clasecola cajero1 = new Clasecola ();
      Clasecola cajero2 = new  Clasecola ();
      Clasecola cajero3 = new Clasecola ();
      Clasecola  cajero4 = new Clasecola ();
        
        System.out.println ( "**** cajero 1 esta vacio?****" );
   
        boolean cajero1vacia;
     cajero1vacia = false;
     boolean Cajero1vacio = false;
        if (!Cajero1vacio) {
            System.out.println("Esperar");
       } 
        else {
            System.out.println("***continuar!!!");
       
        } 
         System.out.println("** ingresar persona a caja 3!!!");
     int opcion = 0;
                       
              if (opcion==1) {
                  if (cola.Colallena()) {
                      System.out.println("CAJA 1 ESTA LLENA NO SE PUEDEN INGRESAR ");
                  } else
                  {
                      System.err.print("Digite un elemento: ");
                      Integer elemento = Integer.parseInt(leer.readLine());
                      try {
                          cola.insertar(elemento);
                      } catch (Exception ex) {
                     Logger.getLogger(Colasupi.class.getName()).log(Level.SEVERE, null, ex);
                      }
                  }
            int Caja = 0;
                                                         if (Caja==1){                         
       try {
           atender_caja1();
       }catch(NoSuchElementException c){
             
           
        int C1=(int)(Math.random()*2+1);
       
        if (C1==1){     
        try {
            atender_caja2();
        }catch(NoSuchElementException b){
             
              try{
                  atender_caja3();
               } catch(NoSuchElementException a){
              cerrar();
            }
          }
        }           
        if (C1==2){                           
        try{
            atender_caja3();
        } catch(NoSuchElementException a){
              try {
                  atender_caja2();
              }catch(NoSuchElementException b){

                  cerrar();
          }
         } 
      }
     }
     
 
    

    
    
    

