/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprestacion;

import java.util.ArrayList;

/**
 *
 * @author Hacobby
 */
public class RegistroYControl {
    
    private ArrayList<Prestacion> equiposPrestados;
    private ArrayList<Item> inventario;
    
    public RegistroYControl() {
        inventario = new ArrayList();
    }
    
    public void agregarItem(String item, int cantidad) {
        inventario.add(new Item(item, cantidad));
    }
    
    public ArrayList<Item> getInventario() {
        return this.inventario;
    }
}
