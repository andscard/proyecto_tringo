/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tringo;

import java.util.ArrayList;

/**
 * Clase InventarioFichas almacena funciones útiles como: crear un inventario 
 * de fichas, devolver un ficha aletaroria que se encuentre dentro del inventario 
 * e indicar que ficha se encuentra en juego
 * @author Andrea Cardenas Sumba
 * @author Mayken Salavarria Tutiven
 * @version 1.0.0
 * 
 */
public class InventarioFichas {
    private ArrayList<Ficha> inventario;

    /**
     * Constructor de la clase InventarioFichas
     * crea un arreglo de fichas de diferentes tipos; la cantidad
     * de fichas en el iventario dependetá de las reglas del juego 
     */
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
        inventario.add(fichaC);
        inventario.add(fichaD);
        inventario.add(fichaD);
        inventario.add(fichaE);
        inventario.add(fichaE);
        inventario.add(fichaE);
        inventario.add(fichaF);
        inventario.add(fichaF);
        inventario.add(fichaF);
        
    }
    
    /**
     * La función sizeInventario devuelve el tamaño del inventario existente 
     * @return tamaño del inventario tipo entero
     */
    public int sizeInventario(){   
        return inventario.size();
    }
    
    /**
     * la función generaFichaAleatoria escoge aleatoriamente una ficha que se
     * encuentre en el inventario, la extrae de este último y la devuelve.
     * Se devolverá una ficha siempre y cuando existan fichas dentro del inventario
     * @return Ficha aleatoria del inventario tipo Ficha 
     */
    public Ficha generaFichaAleatoria(){
    int longitud=inventario.size();
    Ficha ficha;

        int numAleatorio = (int) Math.floor(Math.random() * (longitud - 0) + 0);
        
        if(longitud==0){
        System.out.println("\n      *** Sus fichas se han terminado ***");
        return null;
        }
        
        return ficha=inventario.remove(numAleatorio);
    }
   
    /**
     * La función mensajeFichaEnJuego especifica qué tipo de ficha está en 
     * juego, dando a conocer su nombre.
     * @param ficha tipo Ficha
     */
    public void mensajeFichaEnJuego(Ficha ficha){
        String letraFicha;
        
        letraFicha=ficha.getNombre();
        System.out.println(">>Ficha en juego: "+letraFicha);
    }
   
    
}
