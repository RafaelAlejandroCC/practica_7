/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_7;

/**
 *
 * @author Rafael Alejandro
 */
public class cocodrilo extends Animal{

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
     * @return the dientes
     */
    public String getDientes() {
        return dientes;
    }

    /**
     * @param dientes the dientes to set
     */
    public void setDientes(String dientes) {
        this.dientes = dientes;
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
    private String dientes;
    private String comer;
}