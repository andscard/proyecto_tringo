/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tringo;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class InventarioFichas {
    private ArrayList<Ficha> inventario;

    
    public InventarioFichas(){
        this.inventario = new ArrayList<Ficha>();
        
        Ficha fichaA=new Ficha("A");
        Ficha fichaB=new Ficha("B");
        Ficha fichaC=new Ficha("C");
        Ficha fichaD=new Ficha("D");
        Ficha fichaE=new Ficha("E");
        Ficha fichaF=new Ficha("F");
        
        inventario.add(fichaA);
        inventario.add(fichaA);
        inventario.add(fichaB);
        inventario.add(fichaB);
        inventario.add(fichaB);
        inventario.add(fichaC);
        inventario.add(fichaC);
        inventario.add(fichaE);
        inventario.add(fichaE);
        inventario.add(fichaE);
        inventario.add(fichaF);
        inventario.add(fichaF);
        inventario.add(fichaF);
        
    }
    
    public int sizeInventario(){   
        return inventario.size();
    }
    
    public Ficha generaFichaAleatoria(){
    int longitud=inventario.size();
    Ficha ficha;

        int numAleatorio = (int) Math.floor(Math.random() * (longitud - 0) + 0);
        
        if(longitud==0){
        System.out.println("Sus fichas se han terminado");
        }
        
        return ficha=inventario.remove(numAleatorio);
    }
   
    
    public void mensajeFichaEnJuego(Ficha ficha){
        String letraFicha;
        
        letraFicha=ficha.getNombre();
        System.out.println("\nFicha en juego: "+letraFicha);
    }
   
    
}
