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
public class TarjetaVirtual {
    
    private Casillero [][]tab;
    
    public TarjetaVirtual(){
        this.tab=new Casillero[5][5];
        this.llenarTarjeta();
    }
    
    
    public void llenarTarjeta() {
        int cont = 0;
        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 0; j < this.tab.length; j++) {
                cont = cont + 1;
                this.tab[i][j] = new Casillero(cont, 1);
            }

        }
    }
    
    public int estadoCasillero(Ficha ficha, int x, int y) {
        switch (ficha.getNombre()) {
            case "A":
                if (this.tab[x][y].getEstado() == 1
                        && this.tab[x + 1][y].getEstado() == 1) {
                    return 1;
                }
                break;
            case "B":
                if (this.tab[x][y].getEstado() == 1
                        && this.tab[x][y - 1].getEstado() == 1
                        && this.tab[x][y + 1].getEstado() == 1
                        && this.tab[x - 1][y + 1].getEstado() == 1) {
                    return 1;
                }
                break;
            case "C":
                if (this.tab[x][y].getEstado() == 1
                        && this.tab[x][y - 1].getEstado() == 1
                        && this.tab[x][y + 1].getEstado() == 1
                        && this.tab[x - 1][y].getEstado() == 1) {
                    return 1;
                }
                break;
            case "D":
                if (this.tab[x][y].getEstado() == 1
                        && this.tab[x][y - 1].getEstado() == 1
                        && this.tab[x][y - 2].getEstado() == 1
                        && this.tab[x][y + 1].getEstado() == 1) {
                    return 1;
                }
                break;
            case "E":
                if (this.tab[x][y].getEstado() == 1
                        && this.tab[x][y + 1].getEstado() == 1
                        && this.tab[x + 1][y].getEstado() == 1
                        && this.tab[x + 1][y - 1].getEstado() == 1) {
                    return 1;
                }
                break;
            case "F":
                if (this.tab[x][y].getEstado() == 1
                        && this.tab[x + 1][y].getEstado() == 1
                        && this.tab[x][y - 1].getEstado() == 1
                        && this.tab[x - 1][y - 1].getEstado() == 1) {
                    return 1;
                }
                break;
            default:
                break;
        }

        return 0;

    }
    
        
    
    public int ubicarFichaA(Ficha fichaA, int posicion) {

        int check = 0;
        for (int i = 0; i < this.tab.length - 1; i++) {
            for (int j = 0; j < this.tab.length; j++) {
                if (this.tab[i][j].getContenido() == posicion && this.tab[i][j].getEstado() == 1) {
                    if (this.estadoCasillero(fichaA, i, j) == 1) {
                        check = 1;
                        this.tab[i][j].setEstado(0);
                        this.tab[i + 1][j].setEstado(0);
                        break;
                    }
                }
            }
        }

        if (check == 1) {
            fichaA.mensajeFichaUbicada(1);
        } else {
            fichaA.mensajeFichaUbicada(0);
        }
        return check;

    }

    public int  ubicarFichaB(Ficha fichaB, int posicion) {
        int check = 0;
        for (int i = 1; i < this.tab.length ; i++) {
            for (int j = 1; j < this.tab.length - 1; j++) {

                if ((this.tab[i][j].getContenido() == posicion) && (this.tab[i][j].getEstado() == 1)) {
                    if (this.estadoCasillero(fichaB, i, j) == 1) {

                        check = 1;
                        this.tab[i][j].setEstado(0);
                        this.tab[i][j - 1].setEstado(0);
                        this.tab[i][j + 1].setEstado(0);
                        this.tab[i - 1][j + 1].setEstado(0);

                        break;
                    }
                }

            }
        }

        if (check == 1) {
            fichaB.mensajeFichaUbicada(1);
        } else {
            fichaB.mensajeFichaUbicada(0);
        }
        return check;
    }

    public int ubicarFichaC(Ficha fichaC, int posicion) {
        int check = 0;

        for (int i = 1; i < this.tab.length; i++) {
            for (int j = 1; j < this.tab.length - 1; j++) {

                if ((this.tab[i][j].getContenido() == posicion) && (this.tab[i][j].getEstado() == 1)) {
                    if (this.estadoCasillero(fichaC, i, j) == 1) {
                        check = 1;
                        this.tab[i][j].setEstado(0);
                        this.tab[i][j - 1].setEstado(0);
                        this.tab[i][j + 1].setEstado(0);
                        this.tab[i - 1][j].setEstado(0);
                        break;
                    }
                }
            }
        }
        if (check == 1) {
            fichaC.mensajeFichaUbicada(1);
        } else {
            fichaC.mensajeFichaUbicada(0);
        }
        
        return check;

    }

    public int ubicarFichaD(Ficha fichaD, int posicion) {
        int check = 0;

        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 2; j < this.tab.length - 1; j++) {

                if ((this.tab[i][j].getContenido() == posicion) && (this.tab[i][j].getEstado() == 1)) {
                    if (this.estadoCasillero(fichaD, i, j) == 1) {

                        check = 1;
                        this.tab[i][j].setEstado(0);
                        this.tab[i][j - 1].setEstado(0);
                        this.tab[i][j - 2].setEstado(0);
                        this.tab[i][j + 1].setEstado(0);

                        break;
                    }
                }

            }
        }
        if (check == 1) {
            fichaD.mensajeFichaUbicada(1);
        } else {
            fichaD.mensajeFichaUbicada(0);
        }
        return check;

    }

    public int ubicarFichaE(Ficha fichaE, int posicion) {
        int check = 0;
        for (int i = 0; i < this.tab.length - 1; i++) {
            for (int j = 1; j < this.tab.length - 1; j++) {

                if ((this.tab[i][j].getContenido() == posicion) && (this.tab[i][j].getEstado() == 1)) {
                    if (this.estadoCasillero(fichaE, i, j) == 1) {

                        check = 1;
                        this.tab[i][j].setEstado(0);
                        this.tab[i][j + 1].setEstado(0);
                        this.tab[i + 1][j].setEstado(0);
                        this.tab[i + 1][j - 1].setEstado(0);

                        break;
                    }
                }
            }
        }
        if (check == 1) {
            fichaE.mensajeFichaUbicada(1);
        } else {
            fichaE.mensajeFichaUbicada(0);
        }
        return check;

    }

    public int ubicarFichaF(Ficha fichaF, int posicion) {
        int check = 0;
        for (int i = 1; i < this.tab.length - 1; i++) {
            for (int j = 1; j < this.tab.length; j++) {

                if ((this.tab[i][j].getContenido() == posicion) && (this.tab[i][j].getEstado() == 1)) {
                    if (this.estadoCasillero(fichaF, i, j) == 1) {

                        check = 1;
                        this.tab[i][j].setEstado(0);
                        this.tab[i + 1][j].setEstado(0);
                        this.tab[i][j - 1].setEstado(0);
                        this.tab[i - 1][j - 1].setEstado(0);

                        break;
                    }
                }
            }
        }
        if (check == 1) {
            fichaF.mensajeFichaUbicada(1);
        } else {
            fichaF.mensajeFichaUbicada(0);
        }
        return check;
    }
    

    public int ubicarFichaTablero(Ficha ficha, int posicion) {

        if (ficha.getNombre() == "A") {
            return this.ubicarFichaA(ficha, posicion);
        }

        if (ficha.getNombre() == "B") {
          return  this.ubicarFichaB(ficha, posicion);
        }
        if (ficha.getNombre() == "C") {
           return  this.ubicarFichaC(ficha, posicion);
        }
        if (ficha.getNombre() == "D") {
           return  this.ubicarFichaD(ficha, posicion);
        }
        if (ficha.getNombre() == "E") {
           return  this.ubicarFichaE(ficha, posicion);
        }
        if (ficha.getNombre() == "F") {
           return this.ubicarFichaF(ficha, posicion);
        }
        return 0;

    }

    public void setEstadoCasillero(int filas, int columnas, int i, int j) {
        Casillero cas;
        for (int k = 0; k < filas; k++) {
            for (int m = 0; m < columnas; m++) {
                cas = this.tab[k + i][m + j];
                cas.setEstado(1);    
            }
        }  
    }
    
    public int verificarUnArea(int filas, int columnas, int longitud1, int longitud2) {
        int cont = 0;
        int valor = 0;

        for (int i = 0; i < longitud1; i++) {
            for (int j = 0; j < longitud2; j++) {
                Casillero cas;

                for (int k = 0; k < filas; k++) {
                    for (int m = 0; m < columnas; m++) {
                        cas = this.tab[k + i][m + j];

                        if (cas.getEstado() == 1) {
                            //check = 1;
                            break;
                        }
                        if (cas.getEstado() == 0) {
                            cont++;
                        }

                        if (cont == (filas * columnas)) {
                            this.setEstadoCasillero(filas, columnas, i, j);
                            valor = 1;
                            return valor;
                        } else {
                            valor = 0;
                        }
                    }//llave for m
                }//llave for k
                cont=0;
            }//llave for j  
        }//llave for i

        valor = 0;
        return valor;

    }
    
    public int verificarPuntosPorAreas(){
        int longitud=this.tab.length;
     
        int area_33=this.verificarUnArea(3, 3, longitud-2,longitud-2);
        int area_23=this.verificarUnArea(2, 3, longitud-1,longitud-2);
        int area_32=this.verificarUnArea(3, 2, longitud-2,longitud-1);
        int area_22=this.verificarUnArea(2, 2, longitud-1,longitud-1);
        
        if(area_33==1){
            System.out.println("\n    _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
            System.out.println("    Felicitaciones, ha llenado un área 3x3. Se le acreditan 40 puntos");
            System.out.println("    - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
            this.imprimirTarjeta();
            return 40;
        }else if(area_32==1){
            System.out.println("\n    _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
            System.out.println("    Felicitaciones, ha llenado un área 3x2. Se le acreditan 20 puntos");
            System.out.println("    - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
            this.imprimirTarjeta();
            return 20;
        }else if(area_23==1){
            System.out.println("\n    _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
            System.out.println("    Felicitaciones, ha llenado un área 2x3. Se le acreditan 20 puntos");
            System.out.println("    - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
            this.imprimirTarjeta();
            return 20;
        }else if(area_22==1){
            System.out.println("\n    _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
            System.out.println("    Felicitaciones, ha llenado un área 2x2. Se le acreditan 10 puntos");
            System.out.println("    - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
            this.imprimirTarjeta();
            return 10;
        }else{
        return 0;}
    }
    


    
    public void imprimirTarjeta(){
       for(int i=0; i<this.tab.length;i++){
               for(int j=0; j<this.tab.length;j++){
                   
                   if(this.tab[i][j].getEstado()==0){
                          if(this.tab[i][j].getContenido()>9){
                             System.out.print(" -    ");
                            }else{
                            System.out.print(" "+"-"+ "    ");}
                         
   //                    System.out.print("-    ");
                   }
                   else {
                       if(this.tab[i][j].getContenido()>9){
                            System.out.print(this.tab[i][j].getContenido()+ "    ");
                            }else{
                            System.out.print(" "+this.tab[i][j].getContenido()+ "    ");}
                         }
            }
           System.out.println();
        }
    
    }
   
}
