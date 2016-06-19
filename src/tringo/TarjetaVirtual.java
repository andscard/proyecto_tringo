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
   
    }
    
    
    public void llenarTarjeta(){
        int cont=0;
        for(int i=0; i<this.tab.length;i++){
               for(int j=0; j<this.tab.length;j++){
                   cont=cont+1;
                   this.tab[i][j]=new Casillero(cont,1);
        }
        
        }
    }
    
        
    
public void ubicarFichaA(Ficha fichaA,int posicion){
         
          int check=0;
          for(int i=0; i<this.tab.length-1;i++){
               for(int j=0; j<this.tab.length;j++){
                  if(this.tab[i][j].getContenido()==posicion&&this.tab[i][j].getEstado()==1){
                      
                           check=1;
                           this.tab[i][j].setEstado(0);
                           this.tab[i+1][j].setEstado(0);
                           break;
                      } 
                         }  
                     }
                 
                  if(check==1){
                           fichaA.mensajeFichaUbicada(1);}  
                         else
                         {
                            fichaA.mensajeFichaUbicada(0);  
                         }
    
      }
      
      
    /*  public void ubicarFichaB(int posicion){
      
          Ficha fichaA= new Ficha("A",2);
          for(int i=0; i<this.tab.length;i++){
               for(int j=0; j<this.tab.length;j++){
                   if (i!=4 && (this.tab[i][j].getContenido==posicion)){
                   
                            if(this.tab[i][j].getEstado()==1){
                                
                                this.tab[i][j].setContenido(0);
                                this.tab[i+1][j].setContenido(0);
                            }  
                 
                            
                      fichaA.mensajeFichaUbicada(1);
                       
                       //this.tab[i][j].setEstado(0);
             }
                   else {
                   fichaA.mensajeFichaUbicada(0);
                   }
                  }
      
      
      }
    
          
          
          
          
      
      }*/
    
      
      public void ubicarFichaC(int posicion){
     
      
      }
    
      
      public void ubicarFichaD(int posicion){
     
      
      }
    
    
        public void ubicarFicha(Ficha ficha, int posicion){
        int cont=0;
        
                   if (ficha.getNombre()=="A"){
                       this.ubicarFichaA(posicion);
                   }
                   
                   if (ficha.getNombre()=="B"){
                   }
                   if (ficha.getNombre()=="C"){
                   }
                   if (ficha.getNombre()=="D"){
                   }
                   if (ficha.getNombre()=="E"){
                   }
                   if (ficha.getNombre()=="F"){
                   }
                   if (ficha.getNombre()=="G"){
                                   }
        
        
        
    }
        
        
    public void setEstadoCasillero(int filas, int columnas, int i, int j){
        Casillero cas;
        for(int k=0; k<filas;k++){
                for(int m=0; m<columnas;m++){
                    cas=this.tab[k+i][m+j];
                    cas.setEstado(1);
                    System.out.println("\n\n");
                    this.imprimirTarjeta();
                }        
        }
    }   
    
    public int verificarUnArea(int filas, int columnas, int longitud1, int longitud2){
     int cont =0;
     int valor=0;
     int check=0;
     
    
         for(int i=0; i<longitud1;i++){
            for(int j=0; j<longitud2;j++){
               Casillero cas;
               while(check!=1){
               for(int k=0; k<filas;k++){
                    for(int m=0; m<columnas;m++){
                        cas=this.tab[k+i][m+j];
                     
                        if (cas.getEstado()==1){check=1;
                        break;
                        }
                        if (cas.getEstado()==0){cont++;
                        System.out.println("\nCasillero ocupado"+(k+i)+" "+(m+j));}
                        
                        if (cont==(filas*columnas)){
                            this.setEstadoCasillero(filas, columnas, i, j);
                            valor=1;
                            System.out.println("Contador: "+cont);
                            return valor;
                        }else{
                            valor=0;}
                    }//llave for m
                }//llave for k
               }
               check=0;
              
            }//llave for j  
        }//llave for i
    
         valor=0;
         return valor;
     
    
    }
    
    public int verificarPuntosPorAreas(){
        int longitud=this.tab.length;
     
        int area_22=this.verificarUnArea(2, 2, longitud-1,longitud-1);
        int area_23=this.verificarUnArea(2, 3, longitud-1,longitud-2);
        int area_32=this.verificarUnArea(3, 2, longitud-2,longitud-1);
        int area_33=this.verificarUnArea(3, 3, longitud-2,longitud-2);
        
        if(area_33==1){
            System.out.println("Felicitaciones, ha llenado un área 3x3. Se le acreditan 40 puntos");
            return 40;
        }else if(area_32==1){
            System.out.println("Felicitaciones, ha llenado un área 3x2. Se le acreditan 20 puntos");
            return 20;
        }else if(area_23==1){
            System.out.println("Felicitaciones, ha llenado un área 2x3. Se le acreditan 20 puntos");
            return 20;
        }else if(area_22==1){
            System.out.println("Felicitaciones, ha llenado un área 2x2. Se le acreditan 10 puntos");
            return 10;
        }else{
        return 0;}
    }
    


    
    public void imprimirTarjeta(){
       for(int i=0; i<this.tab.length;i++){
               for(int j=0; j<this.tab.length;j++){
                   
                   if(this.tab[i][j].getEstado()==0){
                       System.out.print("-    ");
                   }
                   else {
                   System.out.print(this.tab[i][j].getEstado()+ "    ");}
            }
           System.out.println();
        }
    
    }
    
    
    
    
}
