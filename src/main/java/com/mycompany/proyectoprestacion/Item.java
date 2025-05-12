/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.magicregister;

/**
 *
 * @author Hacobby
 */
public class Item {
    private String nombre;
    private int cantidad;
    
    public Item(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }
}
