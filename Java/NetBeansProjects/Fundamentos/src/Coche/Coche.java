/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coche;

/**
 *
 * @author tarde
 */
public class Coche {
    
    private String marca;
    private String modelo;
    private int motor;

    public Coche(String marca, String modelo, int motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }
    
        public Coche() {
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }
    
    
    
}
