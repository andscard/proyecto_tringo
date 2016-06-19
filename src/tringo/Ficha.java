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
public class Ficha {
    private String nombre;

    
    public Ficha(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    
    
    public void mensajeFichaUbicada(int valor){
        if (valor==1){
            System.out.println("Celda válida. La ficha "+this.getNombre()+" ha sido colocada");
        }else{
            System.out.println("Celda inválida. No es posible colocar ficha "+this.getNombre());
        }
        
    }
    
    
    
    
    
    
}
