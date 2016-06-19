package tringo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mayken
 */
public class Casillero {
   
    private int contenido;
    private int estado;
    
    
    public Casillero(int cont, int estad){
  
        contenido=cont;
        estado=estad;
        }

    /**
     * @return the posicion
     */
  

    /**
     * @return the cont
     */
    public int getContenido() {
        return contenido;
    }

    /**
     * @param cont the cont to set
     */
    public void setContenido(int cont) {
        this.contenido = cont;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

   
    
}
