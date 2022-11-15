/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_7;

/**
 *
 * @author Rafael Alejandro
 */
public class Gorrion extends Animal{

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the pillar
     */
    public String getPillar() {
        return pillar;
    }

    /**
     * @param pillar the pillar to set
     */
    public void setPillar(String pillar) {
        this.pillar = pillar;
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
    private String raza;
    private String pillar;
    private String comer;
}