/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.magicregister;

/**
 *
 * @author Hacobby
 */
public class Prestacion extends Cliente{
    
    private String horaEntrega;
    private String horaRecibo;
    private int salon;
    private String item;
    
    public Prestacion(String nombre, String ocupacion, int id, String horaEntrega, String horaRecibo, int salon, String item) {
        super(nombre, ocupacion, id);
        this.horaEntrega = horaEntrega;
        this.horaRecibo = horaRecibo;
        this.salon = salon;
        this.item = item;
    }
    
    public int getSalon() {
        return this.salon;
    }
    
    public String getItem() {
        return this.item;
    }
}
