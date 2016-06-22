/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tringo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tringo {

    /**
     * @param args the command line arguments
     * @return 
     */
     private static Juego juego;

    public static String menuPrincipal(){
        System.out.println("\n        *********** TRINGO **********\n");

        System.out.println("1) Iniciar Juego");
        System.out.println("2) Salir");
        System.out.print("Ingrese opción: ");
        
        Scanner s= new Scanner(System.in);
        String i=s.next();
        return i;
        
       
        
    }
    public static  void main(String[] args) {
        
        while(true){
           String opcion= Tringo.menuPrincipal();
           switch(opcion){
               case "1":
                   Scanner name=new Scanner(System.in);
                   System.out.println("\n>> Escriba un nombre de usuario: ");
                   String user=name.next();
                   Tringo.iniciaJuego(user);
                   break;
               case "2":
                   return ;
               default:
                   System.out.println("Opción no válida");
                   break;
           }
        
        }
      }
    
    public static void iniciaJuego(String user) {
    
        Tringo.juego=new Juego(user);
        juego.getTarjeta().imprimirTarjeta();
        while(Tringo.juego.getJugador().getInventario().sizeInventario()>0){
        Tringo.juego.ejecutaTurno();
        }
        if(Tringo.juego.getJugador().getInventario().sizeInventario()==0){
            System.out.println("\n==> Se han terminado las fichas, juego terminado <==");
            System.out.println("         ***FIN DEL JUEGO***");
            
        }
    
    }
    
    
    
}
