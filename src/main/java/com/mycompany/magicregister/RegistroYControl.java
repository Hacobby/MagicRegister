/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.magicregister;

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
        equiposPrestados = new ArrayList();
    }
    
    public void agregarItem(String item, int cantidad) {
        inventario.add(new Item(item, cantidad));
    }
    
    public void agregarPrestamo(String nombre, String ocupacion, int id, String horaEntrega, String horaRecibo, int salon, String item) {
        equiposPrestados.add(new Prestacion(nombre, ocupacion, id, horaEntrega, horaRecibo, salon, item));
    };
    
    public boolean itemExiste(String nombre) {
        for (Item item : inventario) {
            if (item.getNombre().equals(nombre)) { // Ignora mayúsculas/minúsculas
                return true; // El item ya existe
            }
        }
        return false; // No existe
    }
    
    public void actualizarItem(String nombre, int offset) {
        for (Item item : inventario) {
            if (item.getNombre().equalsIgnoreCase(nombre)) { // Verificar si el item ya existe                
                item.setCantidad(item.getCantidad() - offset); // Modificar el item existente
                break;
            }
        }
    }
    
    // Set & Get
    
    public ArrayList<Prestacion> getEquiposPrestados() {
        return this.equiposPrestados;
    }
    
    public ArrayList<Item> getInventario() {
        return this.inventario;
    }
}
