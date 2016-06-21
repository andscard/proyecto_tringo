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
    
    public void validarCeldaIngresada(int celda_tarjeta){
        if (celda_tarjeta<0 || celda_tarjeta>25){
        System.out.println("La celda que ingresó no existe");}
            
    }
    public Ficha FichaEnJuego(){
        Ficha ficha=inventario.generaFichaAleatoria();
        inventario.mensajeFichaEnJuego(ficha);
        this.setTurno(16-inventario.sizeInventario());
        
        return ficha;
    }
    
    public void saltarFicha(int centinela) {
        if (centinela == -1) {

            if (this.getPuntos() == 0) {
                this.setPuntos(0);
                return;
            }

            int nuevos_ptos = this.getPuntos() - 7;
            this.setPuntos(nuevos_ptos);
            System.out.println("Usted ha saltado la ficha, pierde 7 puntos");
        } else {
            return;
        }
    }
    
    public void tiempoLimiteExcedido(int valor) {
        if (valor == 10) {

            if (this.getPuntos() == 0) {
                this.setPuntos(0);
                return;
            }

            int nuevos_ptos = this.getPuntos() - 7;
            this.setPuntos(nuevos_ptos);
            System.out.println("Usted ha excedido el tiempo límite, pierde 7 puntos");
        } else {
            return;
        }
    }
    public void aumentaPuntos(int p){
        this.puntos+=p;
    }
    public void muestraInformacion() {
        System.out.println("\n*****Información de Jugador " + this.getUser() + " *****");
        System.out.println("\n>> Turno Número: " + this.getTurno());
        System.out.println(">> Puntaje Acumulado: " + this.getPuntos());
        System.out.println(">> Estado del Tablero: ");
        this.tarjeta.imprimirTarjeta();
    }

    public void ubicarFichaJugador(int celda_tablero, Ficha ficha){
    int puntos;
        tarjeta.ubicarFichaTablero(ficha, celda_tablero);
        tarjeta.imprimirTarjeta();
        puntos=tarjeta.verificarPuntosPorAreas();
        this.setPuntos(puntos);
    }
    
    public boolean terminaJuego(){
    boolean fin;
        if (this.inventario.sizeInventario()==0){
            System.out.println("Fin del Juego");
            fin=true;
            return fin;
        }else{
            fin=false;
            return fin;}
    }
    
}
