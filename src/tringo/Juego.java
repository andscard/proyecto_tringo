/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tringo;

import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author Usuario
 */
public class Juego {
    Thread t;
    
    private Jugador jugador;
    private TarjetaVirtual tarjeta;

    public Juego(String user) {
        this.jugador = new Jugador(user);
        this.tarjeta = new TarjetaVirtual();
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public TarjetaVirtual getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaVirtual tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    public void muestraInformacion() {
        System.out.println("\n/////////////////////////////////////////////////////////////////////");
        System.out.println("\n***** Jugador " + this.jugador.getUser() + " *****");
        System.out.println(">> Turno Número: " + this.jugador.getTurno());
        System.out.println(">> Puntaje Acumulado: " + this.jugador.getPuntos());
 
    }

    
    public void ejecutaTurno(){
        Scanner sc=new Scanner(System.in);
        if(this.jugador.getInventario().sizeInventario()!=0){
            this.muestraInformacion();
            Ficha ficha=jugador.FichaEnJuego();
            ficha.imprimirFicha();
            temporizadorTurno temp;
            temp=new temporizadorTurno();
            temp.start();
           
            try{
                int valido=0;
                while(valido==0){
                System.out.println("\n-Ingrese celda para la base(1 al 25), si desea saltar la ficha ingrese -1:");
                
                String op=sc.next();
                int posicion= Integer.parseInt(op);
                
                if(posicion ==-1){
                    this.jugador.aumentaPuntos(-7);
                    System.out.println("\n      _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ __");
                    System.out.println("        Usted ha saltado la ficha, pierde 7 puntos");
                    System.out.println("        - - - - - - - - - - - - - - - - - - - - --\n");
                    temp.setDisminuir(0);
                    valido=1;
                    }
                else if(posicion==-2){
                    valido=1;
                    this.jugador.aumentaPuntos(-7);
                    System.out.println("\n       _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                    System.out.println("        Usted ha excedido el tiempo límite, pierde 7 puntos ");
                    System.out.println("        - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                }
                else{
                     temp.setDisminuir(0);
                    valido=this.tarjeta.ubicarFichaTablero(ficha, posicion);
                    }
                
                }
                    temp.stop();
             
               
                this.tarjeta.imprimirTarjeta();
                //this.tarjeta.verificarPuntosPorAreas();
                int puntos=tarjeta.verificarPuntosPorAreas();
                jugador.aumentaPuntos(puntos);
    
             
            }catch(Exception e){
                System.out.println("Ingresaste una posición incorrecta");
                return;
            }
            
           
        }
        else{
            System.out.println("Aqui hay que salir del juego");
        }
    
    }
    
    
    
    
    
    
}
