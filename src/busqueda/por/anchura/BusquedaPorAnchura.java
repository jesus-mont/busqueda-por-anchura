/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda.por.anchura;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chuy_
 */
public class BusquedaPorAnchura {

    /**
     * @param args the command line arguments
     */
        public static int jarra3 = 0, jarra4 = 0, indice=0;
    public static ArrayList<Point> lista = new ArrayList();
      public static  Point aux;
    public static void main(String[] args) {
        // TODO code application logic here
        
        lista.add(new Point(0, 0));
        aux=lista.get(indice);
        while(aux.x !=2){
            /*System.out.println("indice"+ indice);
            System.out.println("auxiliar"+ aux);
            System.out.println(lista);*/
       jarra4=llenar4();
       checarlista();
       jarra4=(int) aux.getX();
       jarra3=(int) aux.getY();
        jarra3=llenar3();
         checarlista();
         jarra4=(int) aux.getX();
       jarra3=(int) aux.getY();
       jarra4=vaciar4();
        checarlista();
        jarra4=(int) aux.getX();
       jarra3=(int) aux.getY();
       jarra3=vaciar3();
        checarlista();
        jarra4=(int) aux.getX();
       jarra3=(int) aux.getY();
       verter4en3(jarra3, jarra4);
        checarlista();
         jarra4=(int) aux.getX();
       jarra3=(int) aux.getY();
        verter3en4(jarra3, jarra4);
        checarlista();
        indice++;
        aux=lista.get(indice);
        }
        
        for(int i=0; i<lista.size(); i++){
        System.out.println(i+ ""+lista.get(i));}
        

        
    
    }
            
    
     public static void checarlista(){
         boolean bandera=true;
        for (int i = 0; i < lista.size(); i++) { 
           
            if(jarra4==lista.get(i).x && jarra3 ==lista.get(i).y){
                 bandera=false; break;
                }else{ bandera=true;
               
            }
            
        }
         if(bandera){
         lista.add(new Point(jarra4,jarra3));
         }  
        

     }
    public static int llenar4(){
    int j4= 4;
        return j4;
    }
    public static int llenar3(){
     jarra3=3;
    return jarra3;}
    
    public static void verter3en4( int j3, int j4){
        int aux = j3+j4;
        if (aux>4){
         jarra4=4;
         jarra3= aux-4;}
        else{
        jarra4= aux;
        jarra3=0;}
    } 
     public static void verter4en3(int j3, int j4){
        int aux = j3+j4;
        if (aux>3){
         jarra4=aux-3;
         jarra3= 3;}
        else{
        jarra4= 0;
        jarra3=aux;}
    } 
         public static int vaciar4() {
        int j4 = 0;
        return j4;
    }

    public static int vaciar3() {
        int j3 = 0;
        return j3;
    }

    
}
