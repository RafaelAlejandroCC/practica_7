/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_7;

/**
 *
 * @author Rafael Alejandro
 */
public class Perro extends Animal{

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the ladrar
     */
    public String getLadrar() {
        return ladrar;
    }

    /**
     * @param ladrar the ladrar to set
     */
    public void setLadrar(String ladrar) {
        this.ladrar = ladrar;
    }

    /**
     * @return the comer
     */
    public String getComer() {
        return comer;
    }

    /**
     * @param comer the comer to set
     */
    public void setComer(String comer) {
        this.comer = comer;
    }

    @Override
    public String caminar() {
        return "caminar";
    }
    
}
