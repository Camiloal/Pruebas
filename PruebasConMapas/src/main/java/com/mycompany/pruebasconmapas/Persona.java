package com.mycompany.pruebasconmapas;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;

/**
 *
 * @author CamiloAlvarez
 */
public class Persona {
    
    private Integer cedula;
    
    private String nombre;
    
    private String apellido;

    public Persona(Integer cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
       
    }

    public Persona() {
    }
    
    

    public HashMap<Integer, Persona> nucleoF=new HashMap<>();
    
    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
