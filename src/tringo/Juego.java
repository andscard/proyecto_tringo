/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tringo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Juego {
    
    
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
    
    
    
    public void ejecutaTurno(){
        Scanner sc=new Scanner(System.in);
        if(this.jugador.getInventario().sizeInventario()!=0){
              
            Ficha ficha=jugador.FichaEnJuego();
            try{
                int valido=0;
                while(valido==0){
                System.out.println("Ingrese celda para la base(1 al 25 [-1 para saltar ficha]): ");
                String op=sc.next();
                int posicion= Integer.parseInt(op);
                if(posicion ==-1){
                    valido=1;
                }
                else{
                    valido=this.tarjeta.ubicarFichaTablero(ficha, posicion);
                    }
                }
                this.tarjeta.imprimirTarjeta();
                this.tarjeta.verificarPuntosPorAreas();
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
