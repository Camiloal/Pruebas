/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import com.mycompany.pruebasconmapas.Persona;
import com.mycompany.pruebasconmapas.Principal;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS-PC
 */
public class NewEmptyJUnitTest {
   
    static Principal p; 
    
    
    @BeforeClass
    public  static void setUpClass() {
        p = new Principal();

           System.out.println("setUpClass");
           quemar();
    }
    
    public static void quemar(){
    
    }
    
    @AfterClass
    public  static void tearDownClass() {
        p = null;
        System.out.println("tearDownClass");
    }
 
      HashMap<Integer, Persona> mapPersons = new HashMap<>();
      String respuesta;
    @Test
    public void pruebaPersona(){
        Persona h1 = new Persona(9, "Juana");
        Persona h2 = new Persona(10, "Paola");
        Persona h3 = new Persona(11, "Sofia");
        Persona h4 = new Persona(12, "Jaime");
        Persona h5 = new Persona(12, "Tatiana");
        Persona h6 = new Persona(14, "Fernando");
        Persona h7 = new Persona(15, "Viviana");
        Persona h8 = new Persona(16, "Diana");

        Persona p1 = new Persona(3, "Andres");
        Persona p2 = new Persona(4, "Maria");
        Persona p3 = new Persona(5, "Carlos");
        Persona p4 = new Persona(6, "Alberto");
        Persona p5 = new Persona(7, "Jimmy");
        Persona p6 = new Persona(8, "Jhon");

        Persona a1 = new Persona(1, "Juan");
        Persona a2 = new Persona(2, "Jose");

        p1.nucleoF.put(h1.getCedula(), h1);
        p1.nucleoF.put(h2.getCedula(), h2);
        p2.nucleoF.put(h3.getCedula(), h3);
        p3.nucleoF.put(h4.getCedula(), h4);
        
        p4.nucleoF.put(h5.getCedula(), h5);
        p4.nucleoF.put(h6.getCedula(), h6);
        p5.nucleoF.put(h7.getCedula(), h7);
        p6.nucleoF.put(h8.getCedula(), h8);
        
        a1.nucleoF.put(p1.getCedula(), p1);
        a1.nucleoF.put(p2.getCedula(), p2);
        a1.nucleoF.put(p3.getCedula(), p3);
        
        a2.nucleoF.put(p4.getCedula(), p4);
        a2.nucleoF.put(p5.getCedula(), p5);
        a2.nucleoF.put(p6.getCedula(), p6);
        

        mapPersons.put(a1.getCedula(), a1);
        mapPersons.put(a2.getCedula(), a2);

        respuesta = p.buscar(mapPersons);
        
        if(respuesta.equals("Andres,Juan,Juana,Paola")) {
        assertEquals("Andres,Juan,Juana,Paola", respuesta);
        }else{
            if(respuesta.equals("Juan,Andres,Juana,Paola,Maria,Sofia,Carlos,Jaime")){
            assertEquals("Juan,Andres,Juana,Paola,Maria,Sofia,Carlos,Jaime", respuesta);
            }else{
                assertEquals("Jimmy,Jose,Viviana", respuesta);
            }
         }
    }   
}
