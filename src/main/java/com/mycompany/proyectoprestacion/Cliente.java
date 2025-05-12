/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.magicregister;

/**
 *
 * @author Hacobby
 */
public class Cliente {
    
    private String nombre;
    private String ocupacion;
    private int id;
    
    
    public Cliente(String nombre, String ocupacion, int id) {
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.id = id;
    }
    
    public void prestar() {
        
    }
    
    public void regresar() {  
        
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
}
