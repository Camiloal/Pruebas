/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebasconmapas;


import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author CamiloAlvarez
 */
public class Principal {
 
    
    Scanner sc = new Scanner(System.in);
    String respuesta;
    
    public Principal() {
    
    }


  
    public String buscar(HashMap<Integer, Persona> mapPersons) {
        System.out.println("Ingrese el documento : ");
       //1,3,7
        Integer cc = 7;
   
        for(Integer key : mapPersons.keySet()){
            Persona pAbuelo = mapPersons.get(key);
            if(cc==key){
               // System.out.println("abuelo  "+pAbuelo.getNombre());
                respuesta=pAbuelo.getNombre();
            }
            
            
           for(Integer key1 :pAbuelo.nucleoF.keySet()){
               Persona pPadre = pAbuelo.nucleoF.get(key1);
               if(cc==key1){
                   //System.out.println("padre  "+pPadre.getNombre());
                   //System.out.println("      abuelo  "+pAbuelo.getNombre());
                   respuesta=pPadre.getNombre()+","+pAbuelo.getNombre();
       
            }
               if(cc==key){
                 //System.out.println("padre  "+pPadre.getNombre()); 
                 respuesta=respuesta+","+pPadre.getNombre();
                 
               }
               
                
                for(Integer key2 : pPadre.nucleoF.keySet()){
                    Persona pHijo = pPadre.nucleoF.get(key2);
                     if(cc==key2){

                        // System.err.println("hijo:  "+pHijo.getNombre());
                         //System.err.println("     padre   "+pPadre.getNombre());
                         //System.err.println("           abuelo  "+pAbuelo.getNombre());
                         
                         respuesta=pHijo.getNombre()+","+pPadre.getNombre()+","+pAbuelo.getNombre();
                         break;
                 
                     }
                     
                     if(cc==key1){
                        // System.out.println("             hijos "+pHijo.getNombre());
                         respuesta=respuesta+","+pHijo.getNombre();
                         
                     }
             
                     if(cc==key){
                         //System.out.println("             hijos "+pHijo.getNombre());
                      
                         respuesta=respuesta+","+pHijo.getNombre();
                     }
             }
                }
        }
        
        return respuesta;

    }
}
