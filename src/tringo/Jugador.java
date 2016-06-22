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
public class Jugador {
    private String user;
    private int turno;
    private int puntos;
    private TarjetaVirtual tarjeta;
    private InventarioFichas inventario;

    public InventarioFichas getInventario() {
        return inventario;
    }

    public void setInventario(InventarioFichas inventario) {
        this.inventario = inventario;
    }
    
    public Jugador(String user){
        this.user=user;
        this.turno= 0;
        this.puntos= 0;
        this.tarjeta= new TarjetaVirtual();
        this.inventario=new InventarioFichas();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
 
    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
 
    
    public Ficha FichaEnJuego(){
        Ficha ficha=inventario.generaFichaAleatoria();
        inventario.mensajeFichaEnJuego(ficha);
        this.setTurno(16-inventario.sizeInventario());
        
        return ficha;
    }
  
   
    public void aumentaPuntos(int p){
        this.puntos=this.puntos+p;
            
            if(this.puntos<0){
                this.puntos=0;
            }
    }
    
    public void ubicarFichaJugador(int celda_tablero, Ficha ficha){
    int puntos;
        tarjeta.ubicarFichaTablero(ficha, celda_tablero);
        tarjeta.imprimirTarjeta();
        puntos=tarjeta.verificarPuntosPorAreas();
        this.setPuntos(puntos);
    }
    
}
