package tringo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase Casillero almacena funciones útiles como: actualizar y devolver el estado 
 * y contenido de un casillero específico
 * @author Andrea Cardenas Sumba
 * @author Mayken Salavarria Tutiven
 * @version 1.0.0
 * 
 */
public class Casillero {
   
    private int contenido;
    private int estado;
    
    /**
    * Constructor de la clase Ficha
    * @param contenido tipo String
    * @param estado tipo int
    */
    public Casillero(int cont, int estado){
  
        this.contenido=cont;
        this.estado=estado;
        }



    /**
     * El método getContenido devuelve el contenido de un casiilero
     * específico (el contenido es un número único de cada casillero
     * y varían entre números del 1 al 25)
     * @return contenido del casillero tipo entero
     */
    public int getContenido() {
        return contenido;
    }

    /**
     * El método setContenido actualiza el contenido actual de un casillero
     * @param cont tipo entero
     */
    public void setContenido(int cont) {
        this.contenido = cont;
    }

    /**
     * El método getEstado devuelve el estado de un casillero
     * El Estado de un casillero puede ser: 1 si el casillero está libre 
     * y 0 si el casillero está ocupado
     * @return estado de casillero tipo entero
     */
    public int getEstado() {
        return estado;
    }

    /**
     * el método setEstado permite actualizar el estado de un casillero
     * @param estado tipo entero
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

   
    
}
