/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tringo;

/**
 * Clase Ficha almacena funciones útiles como imprimir fichas y 
 * presentar mensajes relacionados a la ubicación de una ficha en la tarjeta virtual.
 * @author Andrea Cardenas Sumba
 * @author Mayken Salavarria Tutiven
 * @version 1.0.0
 * 
 */
public class Ficha {
    private String nombre;

    /**
    * Constructor de la clase Ficha
    */
    public Ficha(String nombre){
        this.nombre=nombre;
    }
     
    /**
     * El Método getNombre permite conocer nombre de la Ficha en Juego
     * @return nombre de la Ficha tipo String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * El Método setNombre actualiza el nombre de la ficha
     * @param nombre tipo String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        
    /**
     * El método mensajeFichaUbicada retorna mensajes que validan la posición
     * en la que un jugador desea ubicar una ficha 
     * @param valor número entero que permite diferenciar qué mensaje debe devolver la función
     */
    public void mensajeFichaUbicada(int valor){
        if (valor==1){
            System.out.println("\n      *****Celda válida. La ficha "+this.getNombre()+" ha sido colocada*****\n");
        }else{
            System.out.println("\n      *****Celda inválida. No es posible colocar ficha "+this.getNombre()+" *****");
        }
        
    }
    
    /**
     * El método imprimirFicha muestra por pantalla la ficha que está en juego
     * en cada turno
     */
    public void imprimirFicha (){
        switch(this.nombre){
            
            case "A":
                System.out.println("         _ _");
                System.out.println("        |_*_|");
                System.out.println("        |_ _|");

                break;
            case "B":
                System.out.println("             _ _");
                System.out.println("     _ _ _ _|_ _|");
                System.out.println("    |_ _|_*_|_ _|");
                break;
            case "C":
                System.out.println("         _ _");
                System.out.println("     _ _|_ _|_ _");
                System.out.println("    |_ _|_*_|_ _|");
                break;
            case "D":
                System.out.println("     _ _ _ _ _ _ _ _");
                System.out.println("    |_ _|_ _|_*_|_ _|");
                break;
            case "E":
                System.out.println("         _ _ _ _");
                System.out.println("     _ _|_*_|_ _|");
                System.out.println("    |_ _|_ _|");
                break;
            case "F":
                System.out.println("     _ _ ");
                System.out.println("    |_ _|_ _");
                System.out.println("    |_ _|_*_|");
                System.out.println("        |_ _|");
                break;
        }
    }
    
    
    
    
}
