/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarde
 */
public class Animal {
    
    String especie;
    int edad;
    boolean salvaje;
    
    public Animal(String especie, int edad, boolean salvaje){
        this.especie=especie;
        this.edad=edad;
        this.salvaje=salvaje;
    }
    
        public Animal(){
    }

    @Override
    public String toString() {
        return "Animal{" + "especie=" + especie + ", edad=" + edad + ", salvaje=" + salvaje + '}';
    }
    

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSalvaje() {
        return salvaje;
    }

    public void setSalvaje(boolean salvaje) {
        this.salvaje = salvaje;
    }
    
    
}
