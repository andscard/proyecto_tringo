/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tringo;

/**
 *
 * @author User
 */
public class Tringo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        TarjetaVirtual m=new TarjetaVirtual();
        Ficha fichaA= new Ficha("A");
        m.llenarTarjeta();
        
        m.ubicarFichaA(fichaA,7);
        m.ubicarFichaA(fichaA,8);
        m.ubicarFichaA(fichaA,9);
        m.imprimirTarjeta();
        System.out.println("\n");
        m.verificarPuntosPorAreas();
        m.imprimirTarjeta();
        
        
        //int numAleatorio = (int) Math.floor(Math.random() * (16 - 0) + 0); 
      // System.out.println("Ingrese número de celda para la base de la ficha: "+numAleatorio);
    }
    
}
